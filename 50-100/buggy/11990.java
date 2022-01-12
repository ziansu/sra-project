public boolean connectWith(final com.kcht.parking.charge.timeline.Period another) {
    boolean isLiterallyConnected = ((((this.endHour) == (another.startHour)) && ((this.endMinute) == (another.startMinute))) && ((this.startHour) == (another.endHour))) && ((this.startMinute) == (another.endMinute));
    final boolean isTimeGapConnected = ((this.timeGap()) + (another.timeGap())) == 24;
    return isLiterallyConnected && isTimeGapConnected;
}