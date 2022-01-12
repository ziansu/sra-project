public static int getIntAt(java.lang.String s, java.lang.String key, int fallback) {
    try {
        return java.lang.Integer.parseInt((s + " ").split(key)[1].split("\\D")[0]);
    } catch (java.lang.Exception e) {
        return fallback;
    }
}