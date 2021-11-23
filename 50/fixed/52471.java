@java.lang.Override
public void stateMachineAbort() {
    theQueue.add(new org.ggp.base.util.statemachine.Move(org.ggp.base.util.gdl.grammar.GdlPool.getConstant("ABORT")));
    if ((theGUI) != null) {
        theGUI.showFinalMessage("Aborted");
    }
}