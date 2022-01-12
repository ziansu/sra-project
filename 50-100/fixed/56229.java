@org.springframework.web.bind.annotation.RequestMapping(value = "/messages", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public appserver.mobileapis.controllers.MessagesController.MessageResponse messages(@org.springframework.web.bind.annotation.RequestParam(value = "applicationId", required = true)
java.lang.String applicationId, @org.springframework.web.bind.annotation.RequestParam(value = "fromTime", required = true)
long fromTime, org.springframework.ui.Model model) {
    java.util.List<appserver.db.mongo.data.Message> messageList = messageRepository.findByApplicationIdAndLastUpdateDateGreaterThanOrderByLastUpdateDateDesc(applicationId, fromTime);
    long lastUpdateTime = ((messageList.size()) > 0) ? messageList.get(0).getLastUpdateDate() : fromTime;
    return new appserver.mobileapis.controllers.MessagesController.MessageResponse(messageList, lastUpdateTime);
}