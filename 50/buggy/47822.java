@java.lang.Override
protected boolean constraint() {
    return (agent.isCommander()) && (agent.isCollisionDetected());
}