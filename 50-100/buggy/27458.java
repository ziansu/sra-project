@org.springframework.web.bind.annotation.RequestMapping(value = "/add", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public cn.momia.mapi.web.response.ResponseMessage add(@org.springframework.web.bind.annotation.RequestParam
java.lang.String utoken, @org.springframework.web.bind.annotation.RequestParam
java.lang.String feed) {
    if ((org.apache.commons.lang3.StringUtils.isBlank(utoken)) || (org.apache.commons.lang3.StringUtils.isBlank(feed)))
        return cn.momia.mapi.web.response.ResponseMessage.BAD_REQUEST;
    
    com.alibaba.fastjson.JSONObject feedJson = com.alibaba.fastjson.JSON.parseObject(feed);
    com.alibaba.fastjson.JSONObject baseFeedJson = feedJson.getJSONObject("baseFeed");
    if (baseFeedJson == null)
        return cn.momia.mapi.web.response.ResponseMessage.BAD_REQUEST;
    
    baseFeedJson.put("userId", userServiceApi.USER.get(utoken));
    feedServiceApi.add(feedJson);
    return cn.momia.mapi.web.response.ResponseMessage.SUCCESS;
}