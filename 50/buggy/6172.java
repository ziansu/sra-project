public int size() {
    try {
        return entries.size();
    } catch (java.lang.NullPointerException npx) {
        npx.printStackTrace();
    }
}