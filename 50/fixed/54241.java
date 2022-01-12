public long getKursdatumInMillis() {
    try {
        return de.aw.monma.database.DBConvert.convertAsDate(getAsString(R.string.column_btag)).getTime();
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
    return 0;
}