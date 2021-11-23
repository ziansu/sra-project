public void close(java.lang.String sessionId) {
    LOGGER.info(((("Close interpreter group " + (getId())) + " for session: ") + sessionId));
    java.util.List<org.apache.zeppelin.interpreter.Interpreter> intpForSession = this.remove(sessionId);
    close(intpForSession);
    if ((remoteInterpreterProcess) != null) {
        if ((remoteInterpreterProcess.referenceCount()) <= 0) {
            remoteInterpreterProcess = null;
            org.apache.zeppelin.interpreter.InterpreterGroup.allInterpreterGroups.remove(id);
        }
    }
}