@java.lang.Override
public boolean equals(final java.lang.Object that) {
    com.eclipsesource.v8.V8.checkThread();
    checkReleaesd();
    if (that == (this)) {
        return true;
    }
    if (that == null) {
        return false;
    }
    if ((that.getClass()) == (this.getClass())) {
        return v8._equals(v8.getV8RuntimeHandle(), getHandle(), ((com.eclipsesource.v8.V8Object) (that)).getHandle());
    }
    return false;
}