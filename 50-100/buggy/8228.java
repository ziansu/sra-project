public static org.springframework.web.servlet.ModelAndView getJsonPResponse(boolean success, java.lang.Object message, java.lang.String callback, java.lang.String qId, long requestId) {
    net.media.adserver.common.ApiResponse response = new net.media.adserver.common.ApiResponse(true, message);
    com.google.gson.JsonObject jsonObject = net.media.adserver.controller.util.JsonPResponse.GSON.toJsonTree(response).getAsJsonObject();
    jsonObject.addProperty("qId", qId);
    jsonObject.addProperty("requestId", requestId);
    org.springframework.web.servlet.ModelAndView mv = new org.springframework.web.servlet.ModelAndView("ad_serving");
    mv.addObject("callback", callback);
    mv.addObject("json", net.media.adserver.controller.util.JsonPResponse.GSON.toJson(response));
    return mv;
}