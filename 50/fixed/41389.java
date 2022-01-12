public boolean load() {
    try {
        loadUnsafe();
        return true;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return false;
    }
}