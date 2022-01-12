@java.lang.Override
public void onAdded(java.lang.String collectionName, java.lang.String documentID, java.lang.String fieldsJson) {
    com.thoughtworks.mindit.model.Node node = com.thoughtworks.mindit.helper.JsonParserService.parseNode(fieldsJson);
    node.set_id(documentID);
    if (((tree) != null) && (!(tree.isAlreadyExists(node)))) {
        tree.addNodeFromWeb(node);
    }
}