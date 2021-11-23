private java.lang.String generateResultingJsonString(char wrappingQuote, java.util.Map<java.lang.String, java.lang.Object> jsonMap) {
    net.minidev.json.JSONObject jsonObject = new net.minidev.json.JSONObject(jsonMap);
    java.lang.String newJson = jsonObject.toJSONString(JSONStyle.LT_COMPRESS);
    if ((!(jsonObject.isEmpty())) && ((newJson.charAt(1)) != wrappingQuote)) {
        return replaceUnescapedOccurrencesOfCharacterInText(newJson, newJson.charAt(1), wrappingQuote);
    }
    return newJson;
}