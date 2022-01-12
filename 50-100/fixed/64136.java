public java.util.List<java.lang.String> getRightSide() {
    java.util.List<java.lang.String> readable = new java.util.ArrayList<java.lang.String>();
    for (java.lang.String element : rightSide) {
        element = element.replaceAll("^[0-9]+", "");
        if (!(element.isEmpty())) {
            readable.add(converter.DatabaseToHTMLConverter.convertToHTML(element));
        }
    }
    java.util.HashSet<java.lang.String> right = new java.util.HashSet<java.lang.String>(readable);
    return new java.util.ArrayList<java.lang.String>(right);
}