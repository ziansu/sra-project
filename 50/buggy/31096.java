public boolean isEmpty() {
    try {
        T y = getFirst();
        return false;
    } catch (java.lang.NullPointerException e) {
        return true;
    }
}