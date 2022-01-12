private static java.lang.StringBuffer generateData(java.util.List<mx.cinvestav.gdl.iot.webpage.dto.MeasureDTO> measures, java.lang.String sensorName, java.lang.String color) {
    java.lang.StringBuffer json = new java.lang.StringBuffer("");
    json.append("\"key\":\"").append(sensorName).append("\",");
    json.append("\"color\":\"").append(color).append("\",");
    json.append("\"values\":[").append(mx.cinvestav.gdl.iot.webpage.client.GraphUtils.generateArray(measures)).append("]");
    return json;
}