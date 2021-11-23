public void setObjectsFromString(@org.jetbrains.annotations.NotNull
java.lang.String value) {
    for (java.lang.String symbol : value.split("}")) {
        this.addObject((symbol + "}"));
    }
}