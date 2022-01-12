@java.lang.Override
public org.chromium.mojo.system.impl.WaitResult wait(org.chromium.mojo.system.Handle handle, org.chromium.mojo.system.impl.HandleSignals signals, long deadline) {
    java.nio.ByteBuffer buffer = allocateDirectBuffer(8);
    org.chromium.mojo.system.impl.WaitResult result = new org.chromium.mojo.system.impl.WaitResult();
    result.setMojoResult(org.chromium.mojo.system.impl.CoreImpl.filterMojoResultForWait(nativeWait(buffer, getMojoHandle(handle), signals.getFlags(), deadline)));
    org.chromium.mojo.system.impl.HandleSignalsState signalsState = new org.chromium.mojo.system.impl.HandleSignalsState(new org.chromium.mojo.system.impl.HandleSignals(buffer.getInt(0)), new org.chromium.mojo.system.impl.HandleSignals(buffer.getInt(4)));
    result.setHandleSignalsState(signalsState);
    return result;
}