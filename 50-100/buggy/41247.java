public void onDateSet(android.widget.DatePicker view, int year, int month, int day) {
    java.lang.String strMonth = "" + month;
    java.lang.String strDay = "" + day;
    month++;
    if (month < 10) {
        strMonth = "0" + month;
    }
    if (day < 10) {
        strDay = "0" + month;
    }
    java.lang.String dateString = (((year + "-") + strMonth) + "-") + strDay;
    ((com.jshaak.armadacombatlog.EntryFormActivity) (getActivity())).setDate(dateString);
}