private boolean doResume(java.lang.String errMsg) {
    if ((interruptResume) == (-1)) {
        return RunTimeError(errMsg);
    }
    ExecutingLineIndex = interruptResume;
    interruptResume = -1;
    VarSearchStart = interruptVarSearchStart;
    while ((IfElseStack.peek()) != (com.rfo.basic.Run.IEinterrupt)) {
        IfElseStack.pop();
    } 
    IfElseStack.pop();
    return true;
}