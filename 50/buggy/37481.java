public void inspect(java.lang.Object obj, boolean recursive) {
    try {
        objectClass = java.lang.Class.forName(obj);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}