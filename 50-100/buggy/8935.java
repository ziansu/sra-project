static void writeMap(net.openhft.chronicle.queue.ExcerptAppender appender, java.util.Map<java.lang.String, java.lang.Object> map) {
    try (net.openhft.chronicle.wire.DocumentContext context = appender.writingDocument()) {
        net.openhft.chronicle.wire.Wire wire = context.wire();
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            wire.writeEventName(entry.getKey()).object(entry.getValue());
        }
    }
}