public static java.lang.String getPersianDate(long timeMillies, boolean isFull) {
    java.util.Date date = new java.util.Date(timeMillies);
    ir.anamsoftware.persiandateultimate.ManamPDUltimate m = new ir.anamsoftware.persiandateultimate.ManamPDUltimate(((date.getYear()) + 1900), date.getMonth(), date.getDate());
    if (!isFull)
        return m.getPersianShortDate();
    
    return m.getPersianLongDate();
}