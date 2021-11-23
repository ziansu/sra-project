public static long roundUp(long time) {
    return (com.ifthenelse.ejmoore2.agenda.util.DatetimeUtils.getTomorrow(time)) - (2 * (com.ifthenelse.ejmoore2.agenda.util.DatetimeUtils.ONE_MINUTE));
}