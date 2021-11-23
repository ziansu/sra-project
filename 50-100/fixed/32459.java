@java.lang.Override
public void onReceiveCommand(java.lang.Object message) {
    if ((state) == null) {
        risakka.raft.log.LogEntry entry = new risakka.raft.log.LogEntry(2, new risakka.raft.log.StateMachineCommand("aa", 1, 1));
        state = new risakka.raft.miscellanea.PersistentState(1, getSender(), null, null);
    }
    if (message instanceof java.lang.String) {
        saveSnapshot(new risakka.raft.miscellanea.PersistentState(state));
        java.lang.System.out.println(((("Received message: " + ((java.lang.String) (message))) + " from ") + (getSender())));
    }
}