public boolean connectWith(final com.kcht.parking.charge.timeline.Period another) {
    return ((((this.endHour) == (another.startHour)) && ((this.endMinute) == (another.startMinute))) && ((this.startHour) == (another.endHour))) && ((this.startMinute) == (another.endMinute));
}