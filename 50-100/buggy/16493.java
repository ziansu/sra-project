private boolean isFutureDate(java.lang.String pivotDate, java.lang.String futureDate) {
    if ((((pivotDate != null) && (futureDate != null)) && (!(futureDate.isEmpty()))) && (!(pivotDate.isEmpty()))) {
        try {
            return (com.fiuba.campus2015.extras.Utils.stringToCalendar(futureDate).compareTo(com.fiuba.campus2015.extras.Utils.stringToCalendar(pivotDate))) == 1;
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
    }
    return false;
}