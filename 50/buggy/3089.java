public void actionPerformed(java.awt.event.ActionEvent e) {
    if (o_new) {
        o_reminder.getItem().removeReminder(o_reminder);
    }
    gui.WindowManager.getInstance().closeComponentWindow(o_reminder);
}