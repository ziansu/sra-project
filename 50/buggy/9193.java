public static boolean isJavaKeyword(final java.lang.String token) {
    return (uk.co.real_logic.sbe.util.ValidationUtil.possibleJavaKeyword(token)) && (uk.co.real_logic.sbe.util.ValidationUtil.JAVA_KEYWORDS.contains(token));
}