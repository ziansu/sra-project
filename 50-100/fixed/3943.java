public int getContentLength() {
    for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : this.entrySet()) {
        java.lang.String key = entry.getKey();
        if (key == null) {
            continue;
        }
        for (java.lang.String value : entry.getValue()) {
            if (key.equalsIgnoreCase("content-length")) {
                return java.lang.Integer.parseInt(value);
            }
        }
    }
    return 0;
}