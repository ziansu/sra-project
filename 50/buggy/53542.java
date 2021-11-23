public com.xrosstools.xstate.editor.model.StateMachineDiagram getEmptyDiagram() {
    com.xrosstools.xstate.editor.model.StateMachineDiagram smd = new com.xrosstools.xstate.editor.model.StateMachineDiagram();
    smd.setName("StateMachineDiagram");
    smd.getMachines().add(createStateMachine("state machine 2", 1));
    return smd;
}