@org.jetbrains.annotations.Nullable
private com.intellij.xdebugger.frame.XStackFrame calcTopFrame() {
    try {
        java.util.List<mono.debugger.StackFrameMirror> frames = myThreadMirror.frames();
        mono.debugger.StackFrameMirror frame = org.mustbe.consulo.dotnet.util.ArrayUtil2.safeGet(frames, 0);
        if (frame == null) {
            return null;
        }
        return myTopFrame = new org.mustbe.consulo.dotnet.debugger.DotNetStackFrame(myDebuggerContext, 0, frame);
    } finally {
        myTopFrameCalculated = true;
    }
}