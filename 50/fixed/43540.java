public void setObjectsFromString(@org.jetbrains.annotations.NotNull
java.lang.String value) {
    if (value.isEmpty()) {
        return ;
    }
    for (java.lang.String symbol : value.split("}")) {
        this.addObject((symbol + "}"));
    }
}