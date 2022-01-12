private void flushQueuedErrors() {
    if (!(queuedError_.isEmpty())) {
        initializeOutput(RmdChunkOutputUnit.TYPE_TEXT);
        renderConsoleOutput(queuedError_, classOfOutput(ChunkConsolePage.CONSOLE_ERROR), true);
        queuedError_ = "";
    }
}