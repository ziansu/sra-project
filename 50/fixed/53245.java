public java.lang.String getDateFin() {
    if ((getDate(Constants.TRIP_DATEFIN)) == null) {
        return null;
    }
    return df.format(getDate(Constants.TRIP_DATEFIN));
}