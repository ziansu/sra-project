public static java.lang.String labelToPropertyName(java.lang.String label) {
    return "X-" + (label.replace(" ", "_").toUpperCase());
}