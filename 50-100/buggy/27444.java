private char escapeInDoubleQuotes() {
    final char read = read();
    switch (read) {
        case '\"' :
        case '$' :
        case '\\' :
        case '`' :
            return use(read, this::inDoubleQuotes);
    }
    return next(flush().state(this::backslash).state(() -> read).state(this::inDoubleQuotes).states());
}