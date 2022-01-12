public boolean isDisplayed() throws java.lang.Exception {
    com.alibaba.fastjson.JSONObject jsonObject = new com.alibaba.fastjson.JSONObject();
    jsonObject.put("sessionId", driver.getSessionId());
    jsonObject.put("elementId", driver.getElementId());
    boolean displayed = ((java.lang.Boolean) (utils.request("GET", DriverCommand.IS_ELEMENT_DISPLAYED, jsonObject)));
    return displayed;
}