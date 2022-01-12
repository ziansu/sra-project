private void sendBase(java.lang.String methodName, org.apache.thrift.TBase<?, ?> args, byte type) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TMessage msg = new org.apache.thrift.protocol.TMessage(methodName, type, (++(seqid_)));
    com.rbkmoney.woody.api.trace.TraceData traceData = com.rbkmoney.woody.api.trace.context.TraceContext.getCurrentTraceData();
    oprot_.writeMessageBegin(msg);
    args.write(oprot_);
    oprot_.writeMessageEnd();
    oprot_.getTransport().flush();
}