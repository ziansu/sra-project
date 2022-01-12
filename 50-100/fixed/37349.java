@java.lang.Override
public final int appendToStream(final org.fuin.esc.api.StreamId streamId, final java.util.List<org.fuin.esc.api.CommonEvent> toAppend) {
    org.fuin.objects4j.common.Contract.requireArgNotNull("streamId", streamId);
    org.fuin.objects4j.common.Contract.requireArgNotNull("toAppend", toAppend);
    final java.util.List<org.fuin.esc.api.CommonEvent> events = createIfNotExists(streamId);
    all.addAll(toAppend);
    events.addAll(toAppend);
    notifyListeners(streamId, toAppend, 0);
    return events.size();
}