public java.lang.String lastName() {
    java.util.List<java.lang.String> lastNames = lastNames();
    return lastNames.get(new java.util.Random().nextInt(lastNames.size()));
}