public java.lang.Object call() throws java.lang.Exception {
    try {
        persistOnly(o, id);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        throw e;
    }
    return o;
}