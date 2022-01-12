@java.lang.Override
public boolean equals(final java.lang.Object that) {
    com.eclipsesource.v8.V8.checkThread();
    checkReleaesd();
    if (that instanceof com.eclipsesource.v8.V8Object) {
        return v8._equals(v8.getV8RuntimeHandle(), getHandle(), ((com.eclipsesource.v8.V8Object) (that)).getHandle());
    }
    return false;
}