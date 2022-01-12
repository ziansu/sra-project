void expect(char c) {
    if (!(at(c))) {
        throw new java.lang.Error((("Error while parsing- '" + c) + "' expected."));
    }
    next();
    trim();
}