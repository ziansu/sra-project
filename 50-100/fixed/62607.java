@javax.ejb.Timeout
public void execute() {
    java.util.List<yankee.logic.to.TimeSheet> timeSheets = reminderBean.getTimeSheetsToSendReminder();
    if ((timeSheets != null) && ((timeSheets.size()) > 0)) {
        reminderBean.sendReminderForTimeSheets(reminderBean.getTimeSheetsToSendReminder());
    }else {
        cancelTimer(timerId);
    }
}