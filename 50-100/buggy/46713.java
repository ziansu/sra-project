private static void packJSONObject(org.json.JSONObject json, org.msgpack.core.MessageBufferPacker packer) throws java.io.IOException, org.json.JSONException {
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.Iterator<java.lang.String> iterator = json.keys();
    int length = json.length();
    packer.packMapHeader(length);
    while (iterator.hasNext()) {
        java.lang.String key = iterator.next();
        java.lang.Object value = json.get(key);
        edu.umass.cs.gnscommon.utils.JSONByteConverter.packJSONValue(value, packer);
    } 
}