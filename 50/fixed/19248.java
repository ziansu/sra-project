public void actionPerformed(java.awt.event.ActionEvent e) {
    view.GUI_Event event = new view.GUI_Event(this, myCurrentMonth, myCurrentYear, myEvents);
    event.setVisible(true);
}