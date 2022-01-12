private java.lang.String getHourExpression(int hour, int minutes) {
    if (minutes < 17) {
        return com.abbyberkers.apphome.TimeToWordsConverter.HOURS_MAP.get((hour % 12));
    }else {
        return com.abbyberkers.apphome.TimeToWordsConverter.HOURS_MAP.get(((hour % 12) + 1));
    }
}