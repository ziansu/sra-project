public static java.lang.String replaceEscapes(java.lang.String text) {
    text = text.replace("\\$", "$");
    text = text.replaceAll("\\\\\r?\n", "");
    return org.codehaus.groovy.parser.antlr4.util.StringUtil.replaceStandardEscapes(org.codehaus.groovy.parser.antlr4.util.StringUtil.replaceHexEscapes(org.codehaus.groovy.parser.antlr4.util.StringUtil.replaceOctalEscapes(text)));
}