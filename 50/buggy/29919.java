private void drawCurrentMonth(android.graphics.Canvas canvas) {
    setCalenderToFirstDayOfMonth(calendarWithFirstDayOfMonth, currentDate, (-(monthsScrolledSoFar)), 0);
    drawMonth(canvas, calendarWithFirstDayOfMonth, ((width) * (-(monthsScrolledSoFar))));
}