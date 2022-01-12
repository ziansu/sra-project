@java.lang.Override
protected java.lang.String transformTokens(lu.fisch.structorizer.generators.StringList tokens) {
    tokens.replaceAll("!=", " <> ");
    tokens.replaceAll("&&", " and ");
    tokens.replaceAll("||", " or ");
    tokens.replaceAll("!", " not ");
    tokens.replaceAll("xor", "^");
    tokens.replaceAll("div", "/");
    tokens.replaceAll("<-", "=");
    tokens.replaceAll("{", "[");
    tokens.replaceAll("}", "]");
    return tokens.concatenate();
}