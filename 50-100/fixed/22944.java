@org.springframework.transaction.annotation.Transactional
public void submit(org.openlmis.ivdform.service.VaccineReport report, java.lang.Long userId) {
    report.setStatus(ReportStatus.SUBMITTED);
    org.openlmis.ivdform.service.VaccineReport reportFromDb = getVaccineReportFromDbForUpdate(report);
    repository.update(reportFromDb, report, userId);
    repository.changeStatus(reportFromDb, ReportStatus.SUBMITTED, userId);
    notificationService.sendIVDStatusChangeNotification(reportFromDb, userId);
}