private java.lang.String getStudentsAssignmentsFolderId(java.lang.String classroomId) {
    java.lang.String classroomFolderId = allConnections.driveDB.getClassroomFolder(classroomId);
    java.lang.String folderId = "";
    try {
        com.google.api.services.drive.model.FileList fl = service.files().list().setQ(java.lang.String.format("'%s' in parents", classroomFolderId)).execute();
        folderId = findFileId(fl, "Students Assignments");
    } catch (java.io.IOException e) {
    }
    return folderId;
}