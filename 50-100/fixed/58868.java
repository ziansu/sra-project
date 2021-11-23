public final void output(int size) {
    try {
        writer.write(event, 0, size);
        int localTick = edu.ucla.pls.wiretap.recorders.BinaryLogger.tick;
        if (localTick != (lastSync)) {
            event[0] = edu.ucla.pls.wiretap.recorders.BinaryLogger.SYNC;
            int order = edu.ucla.pls.wiretap.recorders.BinaryLogger.totalOrderId.getAndIncrement();
            int offset = edu.ucla.pls.wiretap.recorders.BinaryLogger.writeInt(order, event, 1);
            writer.write(event, 0, offset);
            lastSync = localTick;
        }
    } catch (java.lang.Exception e) {
    }
}