private long getNextEventTime() {
    return (nextSubtitleEventIndex) == (-1) ? java.lang.Long.MAX_VALUE : subtitle.getEventTime(nextSubtitleEventIndex);
}