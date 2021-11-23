public boolean isDeflated() {
    for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : this.entrySet()) {
        java.lang.String key = entry.getKey();
        for (java.lang.String value : entry.getValue()) {
            if ((key.equalsIgnoreCase("content-type")) && (value.toLowerCase().contains("application/x-deflate"))) {
                return true;
            }
        }
    }
    return false;
}