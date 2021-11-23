@java.lang.Override
public java.lang.String getOpenDayToken(com.yaroslav.other.calendar.WeekDay day) {
    return (day.isTheCurrentDay() ? com.yaroslav.other.calendar.view.ConsoleCalendarRender.COLOR_RED : day.isOtherMonth() ? com.yaroslav.other.calendar.view.ConsoleCalendarRender.COLOR_YELLOW : day.getType().isWeekendDay() ? com.yaroslav.other.calendar.view.ConsoleCalendarRender.COLOR_GREEN : com.yaroslav.other.calendar.view.ConsoleCalendarRender.COLOR_BLACK) + (com.yaroslav.other.calendar.view.ConsoleCalendarRender.TABS);
}