protected static <T> T parse(java.io.Reader in, net.minidev.json.writer.JsonReaderI<T> mapper) {
    try {
        net.minidev.json.parser.JSONParser p = new net.minidev.json.parser.JSONParser(net.minidev.json.parser.JSONParser.DEFAULT_PERMISSIVE_MODE);
        return p.parse(in, mapper);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return null;
    }
}