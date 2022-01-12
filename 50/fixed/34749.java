private void setEmailFieldRequired(java.lang.String required) {
    if ((required != null) && ((required.length()) > 0)) {
        builder.setEmailFieldRequired(java.lang.Boolean.parseBoolean(required));
    }
}