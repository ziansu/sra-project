@org.jetbrains.annotations.NotNull
public java.util.List<com.intellij.debugger.engine.Location> locationsOfLine(@org.jetbrains.annotations.NotNull
com.intellij.debugger.engine.ReferenceType type, @org.jetbrains.annotations.NotNull
com.intellij.debugger.SourcePosition position) throws com.intellij.debugger.NoDataException {
    try {
        final int line = (position.getLine()) + 1;
        return type.locationsOfLine(DebugProcess.JAVA_STRATUM, null, line);
    } catch (com.intellij.debugger.engine.AbsentInformationException ignored) {
    }
    return java.util.Collections.emptyList();
}