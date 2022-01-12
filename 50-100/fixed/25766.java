public void caretUpdate(javax.swing.event.CaretEvent e) {
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("MM/dd/yyyy");
    if ((dateField.getText().length()) == 10) {
        try {
            java.util.Date date = ((java.util.Date) (sdf.parse(dateField.getText())));
            calendarFrame.cal.set(new net.sf.memoranda.date.CalendarDate(date));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
    }
    checkOkEnabled(true);
}