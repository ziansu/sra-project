public java.lang.String getKey() {
    java.lang.String toReturn = this.methodToCall;
    toReturn += "(";
    for (int i = 0; i < (argTypes.length); ++i) {
        toReturn += argTypes[i].toString();
        if (i != ((argTypes.length) - 1)) {
            toReturn += ",";
        }
    }
    toReturn += ")";
    return toReturn;
}