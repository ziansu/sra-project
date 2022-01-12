public boolean AreYou(java.lang.String id) {
    boolean result = false;
    if (identifiers.contains(id.toLowerCase())) {
        result = true;
    }
    return result;
}