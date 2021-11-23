public void actionPerformed(java.awt.event.ActionEvent e) {
    view.GUI_Event event = new view.GUI_Event(myEvents);
    event.setVisible(true);
    refreshCalendar(myCurrentMonth, myCurrentYear);
}