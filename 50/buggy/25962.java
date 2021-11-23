public void close() {
    try {
        s.close();
    } catch (java.lang.Exception e) {
        java.lang.System.err.println(("" + e));
        e.printStackTrace();
    }
}