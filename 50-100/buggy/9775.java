@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
public cn.momia.mapi.web.response.ResponseMessage placeOrder(@org.springframework.web.bind.annotation.RequestParam
java.lang.String utoken, @org.springframework.web.bind.annotation.RequestParam
java.lang.String order) {
    if ((org.apache.commons.lang3.StringUtils.isBlank(utoken)) || (org.apache.commons.lang3.StringUtils.isBlank(order)))
        return cn.momia.mapi.web.response.ResponseMessage.BAD_REQUEST;
    
    com.alibaba.fastjson.JSONObject orderJson = com.alibaba.fastjson.JSON.parseObject(order);
    orderJson.put("customerId", userServiceApi.USER.get(utoken));
    dealServiceApi.ORDER.add(orderJson);
    return cn.momia.mapi.web.response.ResponseMessage.SUCCESS;
}