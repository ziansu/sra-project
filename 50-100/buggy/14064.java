@java.lang.Override
public void close() throws edu.uci.ics.hyracks.api.exceptions.HyracksDataException {
    try {
        if ((appender.getTupleCount()) > 0) {
            edu.uci.ics.hyracks.dataflow.common.comm.util.FrameUtils.flushFrame(writeBuffer, writer);
        }
        writer.close();
        try {
            cursor.close();
        } catch (java.lang.Exception e) {
            throw new edu.uci.ics.hyracks.api.exceptions.HyracksDataException(e);
        }
    } finally {
        indexHelper.close();
    }
}