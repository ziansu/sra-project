@org.springframework.web.bind.annotation.RequestMapping(value = "/addReminder", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String loadAddReminderView(org.springframework.ui.Model model) {
    logger.info("[Controller- Load Add Reminder View] BEGIN");
    java.lang.Long departmentId = java.lang.Long.parseLong("1");
    java.lang.Long roleId = java.lang.Long.parseLong("3");
    int page = 0;
    int size = 1000;
    com.timelinekeeping.controller.List<com.timelinekeeping.model.AccountModel> accountModels = accountService.searchByDepartmentAndRole(departmentId, roleId, page, size);
    logger.info(("[Controller- Load Add Reminder View] size of list employees: " + (accountModels.size())));
    model.addAttribute("ListAccounts", accountModels);
    logger.info("[Controller- Load Add Reminder View] END");
    return com.timelinekeeping.constant.ViewConst.ADD_REMINDER_VIEW;
}