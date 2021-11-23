private java.lang.Object create() {
    lex.eatKeyword("create");
    lex.eatKeyword("array");
    return createArray();
}