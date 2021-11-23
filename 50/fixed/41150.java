public void actionPerformed(java.awt.event.ActionEvent e) {
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("MM/dd/yyyy");
    dateField.setText(sdf.format(calendarFrame.cal.get().getCalendar().getTime()));
}