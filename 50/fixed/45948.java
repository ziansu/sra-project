public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((calendarapplication.CalendarTable.panelflag) == (calendarapplication.panelType.MONTHPANEL))
        return ;
    
    calendarapplication.CalendarApplication.PaintMainFrame.changeCentralPanel(calendarPanel, calendarapplication.panelType.MONTHPANEL);
    calendarapplication.CalendarTable.panelflag = calendarapplication.panelType.MONTHPANEL;
    refreshCalendar(currentMonth, currentYear);
}