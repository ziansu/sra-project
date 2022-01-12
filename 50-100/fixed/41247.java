public void onDateSet(android.widget.DatePicker view, int year, int month, int day) {
    month++;
    java.lang.String strMonth = "" + month;
    java.lang.String strDay = "" + day;
    if (month < 10) {
        strMonth = "0" + month;
    }
    if (day < 10) {
        strDay = "0" + day;
    }
    java.lang.String dateString = (((year + "-") + strMonth) + "-") + strDay;
    ((com.jshaak.armadacombatlog.EntryFormActivity) (getActivity())).setDate(dateString);
}