private java.lang.String getAttributeName() {
    java.lang.String name = nextToken(true);
    if (!(name.matches("[a-zA-Z_]*"))) {
        printErrorMessage(("Invalid attribute name " + name), name.length());
        return null;
    }else
        if (com.github.taffy128s.tlcdbms.sqlparsers.SQLKeyWords.isSQLKeyword(name)) {
            printErrorMessage(("Invalid attribute name " + name), name.length());
            return null;
        }else {
            return name;
        }
    
}