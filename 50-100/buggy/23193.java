private de.schalter.losungen.Losung getLosung(long datum) {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.setTimeInMillis(datum);
    datum = calendar.getTimeInMillis();
    if ((context) == null) {
        context = mainActivity;
    }
    if ((context) == null)
        context = getActivity();
    
    dbHandler = de.schalter.losungen.files.DBHandler.newInstance(context);
    return dbHandler.getLosung(datum);
}