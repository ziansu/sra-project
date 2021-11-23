private de.schalter.losungen.Losung getLosung(long datum) {
    if ((context) == null) {
        context = mainActivity;
    }
    if ((context) == null)
        context = getActivity();
    
    dbHandler = de.schalter.losungen.files.DBHandler.newInstance(context);
    return dbHandler.getLosung(datum);
}