private java.lang.Object getConfiguration(java.lang.String stringRepresentation) {
    try {
        return java.lang.Class.forName(stringRepresentation);
    } catch (java.lang.ClassNotFoundException e) {
        return this.resourceLoader.getResource(stringRepresentation);
    }
}