@java.lang.Override
public void pop() {
    com.google.common.base.Preconditions.checkState((!(closed)));
    com.google.common.base.Preconditions.checkState(((com.microsoft.z3.Native.solverGetNumScopes(z3context, z3solver)) >= 1));
    com.google.common.base.Preconditions.checkState(((level) == ((assertedFormulas.size()) - 1)));
    (level)--;
    assertedFormulas.pop();
    com.microsoft.z3.Native.solverPop(z3context, z3solver, 1);
}