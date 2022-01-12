public boolean has(java.lang.String k) {
    try {
        java.util.LinkedList<java.lang.String> values = this.find(k);
        if (values == null) {
            return false;
        }
        return true;
    } catch (java.lang.IllegalArgumentException e) {
        return false;
    }
}