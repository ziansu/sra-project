@java.lang.Override
public boolean hasVariables() throws org.eclipse.debug.core.DebugException {
    if (!(initialized)) {
        initialize();
        initialized = true;
    }
    return !(transformationVariables.isEmpty());
}