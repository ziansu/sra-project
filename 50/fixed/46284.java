public void setAlignment(com.univocity.parsers.fixed.FieldAlignment alignment, int... positions) {
    for (int position : positions) {
        setAlignment(position, alignment);
    }
}