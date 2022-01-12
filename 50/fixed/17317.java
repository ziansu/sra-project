public void sendIntegerSet(java.util.Set<java.lang.Integer> num) throws java.io.IOException {
    for (java.lang.Integer number : num) {
        out.writeInt(number);
    }
    out.flush();
}