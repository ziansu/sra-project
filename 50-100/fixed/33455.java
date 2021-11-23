@java.lang.Override
public com.ibm.streamsx.topology.TStream<T> endParallel() {
    com.ibm.streamsx.topology.builder.BOutput end = output();
    if (end instanceof com.ibm.streamsx.topology.builder.BUnionOutput) {
        end = com.ibm.streamsx.topology.internal.core.StreamImpl.builder().addPassThroughOperator(end);
    }
    end = com.ibm.streamsx.topology.internal.core.StreamImpl.builder().isolate(end);
    return addMatchingStream(com.ibm.streamsx.topology.internal.core.StreamImpl.builder().unparallel(end));
}