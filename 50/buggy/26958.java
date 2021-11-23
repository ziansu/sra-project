@java.lang.Override
public boolean willDecode(java.lang.String json) {
    json = json.replace("\"", "'");
    log.info(java.lang.String.format("Request: %s", json));
    return tryParse(json);
}