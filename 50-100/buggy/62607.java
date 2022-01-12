@javax.ejb.Timeout
public void execute() {
    java.lang.System.out.println(("----Invoked: " + (java.lang.System.currentTimeMillis())));
    java.util.List<yankee.logic.to.TimeSheet> timeSheets = reminderBean.getTimeSheetsToSendReminder();
    if ((timeSheets != null) && ((timeSheets.size()) > 0)) {
        java.lang.System.out.println("called from programatic timer");
        reminderBean.sendReminderForTimeSheets(reminderBean.getTimeSheetsToSendReminder());
    }else {
        cancelTimer(timerId);
    }
}