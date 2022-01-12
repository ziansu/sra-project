private boolean isFutureDate(java.lang.String pivotDate, java.lang.String futureDate) {
    if ((((pivotDate != null) && (futureDate != null)) && (!(futureDate.isEmpty()))) && (!(pivotDate.isEmpty()))) {
        try {
            if ((com.fiuba.campus2015.extras.Utils.stringToCalendar(pivotDate).compareTo(com.fiuba.campus2015.extras.Utils.stringToCalendar(futureDate))) == 1)
                return true;
            
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
    }
    return false;
}