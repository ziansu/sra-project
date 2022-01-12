public java.util.List<java.lang.String> generate(java.lang.String regEx, int numberOfResults) {
    ar.fiuba.tdd.template.tp0.Parser parser = new ar.fiuba.tdd.template.tp0.Parser();
    java.util.List<ar.fiuba.tdd.template.tp0.Expression> expressions = parser.parse(regEx);
    java.util.List<java.lang.String> generatedStrings = new java.util.ArrayList<>();
    for (int i = 0; i < numberOfResults; ++i) {
        generatedStrings.add(generate(expressions));
    }
    return generatedStrings;
}