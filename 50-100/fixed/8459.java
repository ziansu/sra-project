void generatesDeclarations(java.lang.String expected) {
    java.lang.String[] parseResult = parse();
    com.google.common.truth.Truth.assertThat(parseResult[1]).isEmpty();
    java.lang.String actual = parseResult[0];
    java.lang.String stripped = DeclarationGeneratorTests.GOLDEN_FILE_COMMENTS_REGEXP.matcher(actual).replaceAll("");
    if (!(stripped.equals(expected))) {
        failureStrategy.failComparing("compilation result doesn't match", expected, stripped);
    }
}