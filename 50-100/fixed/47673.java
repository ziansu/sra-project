@java.lang.Override
public final java.lang.String toString() {
    try {
        java.lang.StringBuilder result = new java.lang.StringBuilder();
        com.squareup.javapoet.CodeWriter codeWriter = new com.squareup.javapoet.CodeWriter(result);
        toString(codeWriter);
        return result.toString();
    } catch (java.io.IOException e) {
        throw new java.lang.AssertionError();
    }
}