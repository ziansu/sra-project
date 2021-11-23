private static java.lang.String parseList(java.util.List<java.lang.Object> input) {
    java.lang.String toReturn = "l";
    for (java.lang.Object o : input) {
        toReturn = protocol.BEncode.parse(o);
    }
    toReturn += "e";
    java.lang.System.out.println(("List Parse: " + toReturn));
    return toReturn;
}