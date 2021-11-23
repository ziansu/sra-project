public BoxTask.Info addTaskToFile(java.lang.String token, java.lang.String fileId, java.lang.String message, org.joda.time.DateTime dueAt) throws java.lang.Exception {
    com.box.sdk.BoxFile file = boxFacade.getFile(token, fileId);
    if (file != null) {
        java.util.Date date = null;
        if (dueAt != null) {
            date = dueAt.toDate();
        }
        return file.addTask(BoxTask.Action.REVIEW, message, date);
    }
    throw new java.lang.Exception("The requested file could not be loaded from Box");
}