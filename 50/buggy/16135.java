void expect(char c) {
    if (!(at(c))) {
        java.lang.System.out.println(line);
        throw new java.lang.Error((("Error while parsing- '" + c) + "' expected."));
    }
    next();
    trim();
}