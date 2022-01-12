public static <T> T parse(java.io.InputStream in, java.lang.Class<T> mapTo) {
    try {
        net.minidev.json.parser.JSONParser p = new net.minidev.json.parser.JSONParser(net.minidev.json.parser.JSONParser.DEFAULT_PERMISSIVE_MODE);
        return p.parse(in, net.minidev.json.JSONValue.defaultReader.getMapper(mapTo));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return null;
    }
}