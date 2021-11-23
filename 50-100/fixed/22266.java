public static void main() {
    final java.lang.String caller = java.lang.Thread.currentThread().getStackTrace()[1].getClassName();
    if ((caller.startsWith("jp.uphy.clipboardwatcher")) == false) {
        throw new java.lang.IllegalStateException("Unexpected invocation.  Do not use this class from the out of this package.");
    }
    javafx.application.Application.launch();
}