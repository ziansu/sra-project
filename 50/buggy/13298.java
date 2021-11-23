public static Event PreambleStart(double time, Node source) {
    return new Event(time, source, EventType.PREAMBLE_START);
}