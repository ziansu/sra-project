public void approveTimeSheet(com.github.neunkasulle.chronocommand.control.TimeSheet timeSheet) throws com.github.neunkasulle.chronocommand.control.ChronoCommandException {
    if (org.apache.shiro.SecurityUtils.getSubject().isPermitted(Role.PERM_SUPERVISOR)) {
        throw new com.github.neunkasulle.chronocommand.control.ChronoCommandException(Reason.NOTPERMITTED);
    }
    timeSheet.setTimeSheetState(TimeSheetState.CHECKED);
    this.sendEmail(timeSheet.getUser(), "Your time sheet has been approved");
    com.github.neunkasulle.chronocommand.control.TimeSheetDAO.getInstance().saveTimeSheet(timeSheet);
    com.github.neunkasulle.chronocommand.control.TimeSheetControl.LOGGER.info(((("checked: " + (timeSheet.getMonth())) + " ") + (timeSheet.getUser().getUsername())));
}