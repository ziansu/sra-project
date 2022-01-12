@com.messagecenter.portal.controller.RequestMapping(value = "/api/MessageList", method = RequestMethod.GET)
public com.messagecenter.portal.entity.base.BaseResponse<com.messagecenter.portal.entity.base.PageInfoResult<com.messagecenter.portal.entity.MessageQueueInfo>> getMessageList(@com.messagecenter.portal.controller.RequestParam(required = false)
java.lang.Integer pageNum, @com.messagecenter.portal.controller.RequestParam(required = false)
java.lang.Integer pageSize, @com.messagecenter.portal.controller.RequestParam(required = false)
java.lang.Integer id) {
    com.messagecenter.portal.entity.base.PageInfoResult<com.messagecenter.portal.entity.MessageQueueInfo> result = messageQueueInfoService.getMessageQueueInfoList(pageNum, pageSize, id);
    com.messagecenter.portal.entity.base.BaseResponse<com.messagecenter.portal.entity.base.PageInfoResult<com.messagecenter.portal.entity.MessageQueueInfo>> response = new com.messagecenter.portal.entity.base.BaseResponse();
    response.setData(result);
    response.setCode(StatusCode.SUCCESS);
    return response;
}