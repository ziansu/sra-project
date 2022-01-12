public static com.project1.domain.Activity addActivity(java.util.Date dateBegin, java.util.Date dateEnd, java.lang.String comment, com.project1.domain.ProjectCommitment project) {
    com.project1.domain.Activity activity = new com.project1.domain.Activity(dateBegin, dateEnd, comment, project);
    com.project1.controller.RecordController.zem.persistObject(activity);
    return activity;
}