@co.zero.vogue.resource.RequestMapping(value = "/reportClosedTasksInLastYearResponseEntity", method = RequestMethod.GET)
public org.springframework.http.ResponseEntity<co.zero.vogue.report.ReportTasksClosedInLastYear> reportClosedTasksInLastYearResponseEntity() {
    co.zero.vogue.report.ReportTasksClosedInLastYear report = service.reportClosedTasksInLastYear();
    return new org.springframework.http.ResponseEntity(report, org.springframework.http.HttpStatus.OK);
}