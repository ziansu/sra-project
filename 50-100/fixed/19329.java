@java.lang.SuppressWarnings(value = "unchecked")
private java.util.Map<java.lang.String, java.lang.Object> fillStrategyMapItems() throws java.lang.Exception {
    java.lang.String mapData = this.getFields().get("mapData");
    mapData = com.netsteadfast.greenstep.util.SimpleUtils.deB64(mapData);
    java.lang.String jsonData = java.net.URLDecoder.decode(mapData, "utf8");
    java.util.Map<java.lang.String, java.lang.Object> dataMap = ((java.util.Map<java.lang.String, java.lang.Object>) (new com.fasterxml.jackson.databind.ObjectMapper().readValue(jsonData, java.util.LinkedHashMap.class)));
    return dataMap;
}