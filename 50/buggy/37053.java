public int getInt(java.lang.String name) {
    return java.lang.Integer.parseInt(data.get(name).replaceAll("\\s+", ""));
}