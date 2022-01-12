private void drawPreviousMonth(android.graphics.Canvas canvas) {
    setCalenderToFirstDayOfMonth(calendarWithFirstDayOfMonth, currentDate, (-(monthsScrolledSoFar)), (-1));
    drawMonth(canvas, calendarWithFirstDayOfMonth, ((width) * ((-(monthsScrolledSoFar)) - 1)));
}