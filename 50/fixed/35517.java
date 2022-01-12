@co.zero.vogue.resource.RequestMapping(value = "/reportClosedTasksInLastYear", method = RequestMethod.GET)
public org.springframework.http.ResponseEntity<co.zero.vogue.report.ReportTasksClosedInLastYear> reportClosedTasksInLastYear() {
    co.zero.vogue.report.ReportTasksClosedInLastYear report = service.reportClosedTasksInLastYear();
    return new org.springframework.http.ResponseEntity(report, org.springframework.http.HttpStatus.OK);
}