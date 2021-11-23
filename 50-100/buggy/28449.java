@java.lang.Override
public void close() {
    com.google.common.base.Preconditions.checkState((!(closed)));
    while ((level) > 0) {
        pop();
    } 
    assertedFormulas.clear();
    com.microsoft.z3.Native.solverDecRef(z3context, z3solver);
    closed = true;
}