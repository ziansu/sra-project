@java.lang.Override
public void beginWindow(long windowId) {
    if (com.datatorrent.stram.CustomControlTupleTest.run) {
        out.emitControl(new java.lang.Long(((com.datatorrent.stram.CustomControlTupleTest.controlIndex)++)));
        sendControl = true;
    }
}