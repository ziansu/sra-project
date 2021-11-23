private void recordRootSpan(final com.navercorp.pinpoint.bootstrap.context.Trace trace, final com.navercorp.pinpoint.plugin.thrift.ThriftRequestProperty parentTraceInfo) {
    com.navercorp.pinpoint.bootstrap.context.SpanRecorder recorder = trace.getSpanRecorder();
    recorder.markBeforeTime();
    recorder.recordServiceType(com.navercorp.pinpoint.plugin.thrift.interceptor.tprotocol.server.THRIFT_SERVER);
    recorder.recordApi(this.thriftServerEntryMethodDescriptor);
    if (!(trace.isRoot())) {
        recordParentInfo(recorder, parentTraceInfo);
    }
}