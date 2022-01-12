@org.springframework.web.bind.annotation.RequestMapping(value = "/update", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public cn.momia.mapi.web.response.ResponseMessage updateParticipant(@org.springframework.web.bind.annotation.RequestParam
java.lang.String utoken, @org.springframework.web.bind.annotation.RequestParam
java.lang.String participant) {
    if ((org.apache.commons.lang3.StringUtils.isBlank(utoken)) || (org.apache.commons.lang3.StringUtils.isBlank(participant)))
        return cn.momia.mapi.web.response.ResponseMessage.BAD_REQUEST;
    
    com.alibaba.fastjson.JSONObject paticipantJson = com.alibaba.fastjson.JSON.parseObject(participant);
    paticipantJson.put("userId", userServiceApi.USER.get(utoken));
    userServiceApi.PARTICIPANT.update(com.alibaba.fastjson.JSON.toJavaObject(paticipantJson, cn.momia.api.user.participant.Participant.class));
    return cn.momia.mapi.web.response.ResponseMessage.SUCCESS;
}