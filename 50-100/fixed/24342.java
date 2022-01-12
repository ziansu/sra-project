private void setReminderTabBackground() {
    if ((gui.LookupHelper.getAllDueReminders(o_thread).size()) > 0) {
        o_tabs.setTitleAt(5, "Reminders *");
        o_tabs.setBackgroundAt(5, java.awt.Color.red);
    }else {
        o_tabs.setTitleAt(5, "Reminders");
        o_tabs.setBackgroundAt(5, o_tabs.getBackgroundAt(0));
    }
}