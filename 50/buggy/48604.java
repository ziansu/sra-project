public boolean getBool(java.lang.String name) {
    return java.lang.Boolean.parseBoolean(data.get(name).replaceAll("\\s+", ""));
}