private long toDateTimeValue() throws com.asakusafw.runtime.io.csv.CsvFormatException {
    parsePositionBuffer.setIndex(0);
    parsePositionBuffer.setErrorIndex((-1));
    java.util.Date parsed = dateTimeFormat.parse(lineBuffer.toString(), parsePositionBuffer);
    if ((parsePositionBuffer.getIndex()) == 0) {
        throw new com.asakusafw.runtime.io.csv.CsvFormatException(createStatusInLine(Reason.INVALID_CELL_FORMAT, dateTimeFormat.toPattern()), null);
    }
    calendarBuffer.setTime(parsed);
    return com.asakusafw.runtime.value.DateUtil.getSecondFromCalendar(calendarBuffer);
}