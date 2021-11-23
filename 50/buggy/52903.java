private boolean hasJavadocTools() {
    try {
        java.lang.Class.forName("com.sun.tools.javadoc.Main");
        return true;
    } catch (java.lang.Exception e) {
        return false;
    }
}