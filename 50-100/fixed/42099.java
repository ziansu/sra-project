protected model.db.DBClient.DBData getDocumentNotUsing(org.bson.Document document) {
    model.db.DBClient.DBData ans = new model.db.DBClient.DBData();
    ans.object = new org.bson.Document(document);
    ans.past = new org.bson.Document(document);
    ans.id = ((org.bson.types.ObjectId) (document.get("_id")));
    return ans;
}