@java.lang.Override
public void store(com.navercorp.pinpoint.profiler.context.storage.Span span) {
    final java.util.List<com.navercorp.pinpoint.profiler.context.storage.SpanEvent> storage = clearBuffer();
    span = spanPostProcessor.postProcess(span, storage);
    dataSender.send(span);
    if (com.navercorp.pinpoint.profiler.context.storage.BufferedStorage.isDebug) {
        com.navercorp.pinpoint.profiler.context.storage.BufferedStorage.logger.debug("[BufferedStorage] Flush span {}", span);
    }
}