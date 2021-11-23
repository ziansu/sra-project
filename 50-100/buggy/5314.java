@org.springframework.web.bind.annotation.RequestMapping(value = "/signup", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public cn.momia.mapi.web.response.ResponseMessage add(@org.springframework.web.bind.annotation.RequestParam
java.lang.String utoken, @org.springframework.web.bind.annotation.RequestParam
java.lang.String leader) {
    if ((org.apache.commons.lang3.StringUtils.isBlank(utoken)) || (org.apache.commons.lang3.StringUtils.isBlank(leader)))
        return cn.momia.mapi.web.response.ResponseMessage.BAD_REQUEST;
    
    com.alibaba.fastjson.JSONObject leaderJson = com.alibaba.fastjson.JSON.parseObject(leader);
    leaderJson.put("userId", userServiceApi.USER.get(utoken));
    userServiceApi.LEADER.add(com.alibaba.fastjson.JSON.toJavaObject(leaderJson, cn.momia.api.user.leader.Leader.class));
    return cn.momia.mapi.web.response.ResponseMessage.SUCCESS;
}