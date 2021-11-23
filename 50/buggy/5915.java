@com.anonyk.azzcom.controllers.RequestMapping(value = "/contents", method = RequestMethod.GET)
public java.lang.Object getTopicContent(@com.anonyk.azzcom.controllers.RequestHeader
java.lang.Integer page, @com.anonyk.azzcom.controllers.RequestHeader
java.lang.Integer size, @com.anonyk.azzcom.controllers.RequestHeader
java.lang.Long topicid) throws java.lang.Exception {
    return programContentService.getTopicContent(topicid, page, size);
}