@java.lang.Override
public java.lang.String toJson() {
    final java.lang.StringBuilder json = new java.lang.StringBuilder("{");
    if ((timestamp) != null) {
        json.append("\"timestamp\":\"").append(com.fasterxml.jackson.databind.util.ISO8601Utils.format(timestamp, true, defaultTimeZone)).append("\",");
    }
    json.append("\"status\":\"").append(status).append("\",\"description\":\"").append(description).append("\"}");
    return json.toString();
}