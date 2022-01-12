protected byte[] prependSyn(byte[] action) {
    byte[] result = new byte[(magma.tools.SAProxy.impl.AgentProxy.SYNC_BYTES.length) + (action.length)];
    java.lang.System.arraycopy(magma.tools.SAProxy.impl.AgentProxy.SYNC_BYTES, 0, result, 0, magma.tools.SAProxy.impl.AgentProxy.SYNC_BYTES.length);
    java.lang.System.arraycopy(action, 0, result, magma.tools.SAProxy.impl.AgentProxy.SYNC_BYTES.length, action.length);
    return result;
}