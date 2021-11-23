private void archiveGradesSpreadsheet(final java.lang.String archiveId, final java.lang.String siteId, final java.lang.String toolId) {
    final java.lang.String spreadsheetReference = java.lang.String.join(Entity.SEPARATOR, AssignmentService.REF_TYPE_GRADES, siteId);
    byte[] gradesSpreadsheet;
    try {
        gradesSpreadsheet = this.assignmentService.getGradesSpreadsheet(spreadsheetReference);
        if (gradesSpreadsheet != null) {
            this.archiverService.archiveContent(archiveId, siteId, toolId, gradesSpreadsheet, "grades.xls");
        }
    } catch (org.sakaiproject.exception.IdUnusedException | org.sakaiproject.exception.PermissionException e) {
        log.error(("Error getting grades spreadsheet for site {} " + siteId));
    }
}