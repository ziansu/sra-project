private void populateWorkLogModel(org.springframework.ui.ModelMap model, java.lang.Long issueId, org.springframework.data.domain.Pageable pageable) {
    model.addAttribute("currentUser", workLogSecurityService.getActiveUser());
    model.addAttribute("parsedDueDate", formatDate(getCurrentIssue(issueId).getDueDate()));
    model.addAttribute("totalSpentTimeByAllUsers", getTotalSpentTimeForIssueByAllUsers(issueId));
    model.addAttribute("workLogsOfCurrentIssueByAllUsers", findByIssue(getCurrentIssue(issueId), pageable));
}