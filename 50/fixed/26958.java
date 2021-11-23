@java.lang.Override
public boolean willDecode(java.lang.String json) {
    return tryParse(json.replace("\"", "'"));
}