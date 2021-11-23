@java.lang.Override
protected void consumeLoop() {
    setCurrentOffset(_consumeOffsets.remove());
    terminateLoopIfNecessary();
}