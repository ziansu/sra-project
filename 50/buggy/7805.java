@org.jetbrains.annotations.Nullable
@java.lang.Override
public com.intellij.xdebugger.breakpoints.XLineBreakpointType<?> getBreakpointTypeClass(@org.jetbrains.annotations.NotNull
com.intellij.openapi.project.Project project) {
    return XBreakpointType.EXTENSION_POINT_NAME.findExtension(com.intellij.debugger.ui.breakpoints.JavaLineBreakpointType.class);
}