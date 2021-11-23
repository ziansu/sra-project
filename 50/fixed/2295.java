org.parboiled.Rule WhiteSpaceChars() {
    return FirstOf(" ", "\t", "\n");
}