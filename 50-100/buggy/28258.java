@java.lang.Override
public void emitTuples() {
    if (com.datatorrent.stram.CustomControlTupleTest.run) {
        out.emit(new java.lang.Double(((com.datatorrent.stram.CustomControlTupleTest.dataIndex)++)));
        if (sendControl) {
            out.emitControl(new com.datatorrent.api.CustomControlTuple(new java.lang.Long(((com.datatorrent.stram.CustomControlTupleTest.controlIndex)++))));
            sendControl = false;
        }
    }
}