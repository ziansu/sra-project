@java.lang.Override
public boolean isAt(java.time.LocalDateTime time) {
    if (!(daysOfSale.contains(time.getDayOfWeek()))) {
        return false;
    }
    return (fromDayTime.isBefore(time.toLocalTime())) && (fromDayTime.plus(duration).isAfter(time.toLocalTime()));
}