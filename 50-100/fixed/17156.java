@org.springframework.web.bind.annotation.RequestMapping(value = "/", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String loadManagementReminderView(org.springframework.ui.Model model) {
    logger.info("[Controller- Load Management Reminder View] BEGIN");
    java.lang.Long mangerId = java.lang.Long.parseLong("1");
    int page = 0;
    int size = 1000;
    org.springframework.data.domain.Page<com.timelinekeeping.model.ReminderModel> pageReminder = reminderService.listByEmployee(mangerId, page, size);
    java.util.List<com.timelinekeeping.model.ReminderModel> reminderModels = pageReminder.getContent();
    logger.info(("[Controller- Load Management Reminder View] [Size] list of reminders: " + (reminderModels.size())));
    model.addAttribute("ListReminders", reminderModels);
    logger.info("[Controller- Load Management Reminder View] END");
    return com.timelinekeeping.constant.ViewConst.MANAGEMENT_REMINDER_VIEW;
}