@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/gethottopiclist")
@javax.ws.rs.Produces(value = (javax.ws.rs.core.MediaType.APPLICATION_JSON) + ";charset=utf-8")
public java.util.List<th.co.gosoft.go10.model.TopicModel> getHotTopicList() {
    java.lang.System.out.println(">>>>>>>>>>>>>>>>>>> getHotTopicList()");
    java.util.List<th.co.gosoft.go10.model.TopicModel> topicModelList = th.co.gosoft.go10.rest.TopicService.db.findByIndex(getHotTopicListJsonString(), th.co.gosoft.go10.model.TopicModel.class, new com.cloudant.client.api.model.FindByIndexOptions().sort(new com.cloudant.client.api.model.IndexField("date", com.cloudant.client.api.model.IndexField.SortOrder.desc)).limit(20));
    java.util.List<th.co.gosoft.go10.model.TopicModel> resultList = formatDate(topicModelList);
    java.lang.System.out.println(("getHotTopicList list size : " + (resultList.size())));
    return resultList;
}