public static <T> T parse(java.io.InputStream in, T toUpdate) {
    try {
        net.minidev.json.parser.JSONParser p = new net.minidev.json.parser.JSONParser(net.minidev.json.parser.JSONParser.DEFAULT_PERMISSIVE_MODE);
        return p.parse(in, new net.minidev.json.writer.UpdaterMapper<T>(net.minidev.json.JSONValue.defaultReader, toUpdate));
    } catch (java.lang.Exception e) {
        return null;
    }
}