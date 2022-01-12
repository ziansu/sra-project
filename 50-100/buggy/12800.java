@org.springframework.security.access.prepost.PreAuthorize(value = "@workLogSecurityService.hasPermissionToEditWorkLog(#workLogId)")
@com.softserverinc.edu.controllers.GetMapping(value = "issue/{issueId}/worklog/{workLogId}/edit")
public java.lang.String issueByIdEditWorklog(@com.softserverinc.edu.controllers.PathVariable
java.lang.Long issueId, @com.softserverinc.edu.controllers.PathVariable
java.lang.Long workLogId, org.springframework.ui.ModelMap model, @org.springframework.beans.factory.annotation.Qualifier(value = "worklog")
@org.springframework.data.web.PageableDefault(value = com.softserverinc.edu.constants.PageConstant.AMOUNT_PROJECT_ELEMENTS)
org.springframework.data.domain.Pageable workLogPageable) {
    com.softserverinc.edu.entities.Issue issue = issueService.findById(issueId);
    model.addAttribute("issue", issue);
    model.addAttribute("issueCommentsList", issueCommentService.findByIssueId(issueId));
    model.addAttribute("newIssueComment", getNewIssueComment(issueId));
    workLogService.forEditWorkLogModel(model, workLogId, issueId, workLogPageable);
    return "issue_view";
}