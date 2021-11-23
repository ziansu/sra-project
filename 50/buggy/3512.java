public static java.util.List<com.sun.org.apache.xpath.internal.operations.String> stripPunctuation(com.sun.org.apache.xpath.internal.operations.String line) {
    java.util.List<com.sun.org.apache.xpath.internal.operations.String> stringWOPunctuation = java.util.Arrays.asList(line.split(" "));
    return stringWOPunctuation;
}