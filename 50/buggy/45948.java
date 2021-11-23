public void actionPerformed(java.awt.event.ActionEvent e) {
    calendarapplication.CalendarApplication.PaintMainFrame.changeCentralPanel(calendarPanel, calendarapplication.panelType.MONTHPANEL);
    javax.swing.JButton btn = ((javax.swing.JButton) (e.getSource()));
    calendarapplication.CalendarTable.panelflag = calendarapplication.panelType.MONTHPANEL;
    refreshCalendar(currentMonth, currentYear);
}