@java.lang.Override
public nl.wiegman.timetracker.util.Period getPrevious() {
    java.util.Calendar previous = ((java.util.Calendar) (getFrom().clone()));
    previous.add(java.util.Calendar.MONTH, (-1));
    return new nl.wiegman.timetracker.util.MonthPeriod(previous);
}