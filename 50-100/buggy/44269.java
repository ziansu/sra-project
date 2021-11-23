protected model.db.DBClient.DBData addDocumentToUsing(org.bson.Document document) {
    model.db.DBClient.DBData ans = new model.db.DBClient.DBData();
    ans.object = document;
    ans.past = new org.bson.Document(document);
    ans.id = ((org.bson.types.ObjectId) (document.get("_id")));
    ans.object.remove("_id");
    this.using.add(ans);
    return ans;
}