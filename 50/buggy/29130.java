public void setAlignment(com.univocity.parsers.fixed.FieldAlignment alignment, java.lang.String... names) {
    for (java.lang.String name : names) {
        int position = indexOf(name);
        setAlignment(alignment, position);
    }
}