@java.lang.Override
protected java.util.ArrayList<com.iotalabs.physics_101.entity.SubTopicDO> doInBackground(java.lang.Integer... params) {
    com.parse.ParseQuery<com.parse.ParseObject> query = com.parse.ParseQuery.getQuery("SubTopics");
    query.whereEqualTo("topicId", params[0]);
    try {
        subTopicsList = prepareSubTopicDOList(query.find());
    } catch (com.parse.ParseException e) {
        e.printStackTrace();
        return null;
    }
    return subTopicsList;
}