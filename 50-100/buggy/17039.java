@java.lang.Override
public java.lang.String toJson() {
    final java.lang.StringBuilder json = new java.lang.StringBuilder("{");
    if ((timestamp) != null) {
        json.append((("\"timestamp\":\"" + (com.fasterxml.jackson.databind.util.ISO8601Utils.format(timestamp, true, defaultTimeZone))) + "\","));
    }
    json.append((((("\"status\":\"" + (status)) + "\",\"description\":\"") + (description)) + "\"}"));
    return json.toString();
}