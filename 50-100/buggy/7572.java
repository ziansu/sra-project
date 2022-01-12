public static java.lang.String compress(java.lang.String input, net.minidev.json.JSONStyle style) {
    try {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        new net.minidev.json.parser.JSONParser(net.minidev.json.parser.JSONParser.DEFAULT_PERMISSIVE_MODE).parse(input, new net.minidev.json.writer.CompessorMapper(net.minidev.json.JSONValue.defaultReader, sb, style));
        return sb.toString();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return input;
    }
}