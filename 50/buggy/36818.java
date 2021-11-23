public static com.hazelcast.simulator.protocol.operation.OperationType fromInt(int classId) {
    try {
        return com.hazelcast.simulator.protocol.operation.OperationType.values()[classId];
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        throw new java.lang.IllegalArgumentException(("Unknown message type: " + classId));
    }
}