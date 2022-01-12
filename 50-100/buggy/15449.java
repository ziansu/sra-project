public boolean isDisplayed() throws java.lang.Exception {
    com.alibaba.fastjson.JSONObject jsonObject = new com.alibaba.fastjson.JSONObject();
    jsonObject.put("sessionId", driver.getSessionId());
    jsonObject.put("elementId", driver.getElementId());
    com.alibaba.fastjson.JSONObject response = ((com.alibaba.fastjson.JSONObject) (utils.request("GET", DriverCommand.IS_ELEMENT_DISPLAYED, jsonObject)));
    boolean displayed = response.getBoolean("value");
    return displayed;
}