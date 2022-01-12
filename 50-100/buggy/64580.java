public BoxTask.Info addTaskToFile(java.lang.String token, java.lang.String fileId, java.lang.String message, org.joda.time.DateTime dueAt) throws java.lang.Exception {
    com.box.sdk.BoxFile file = boxFacade.getFile(token, fileId);
    if (file != null) {
        return file.addTask(BoxTask.Action.REVIEW, message, dueAt.toDate());
    }
    throw new java.lang.Exception("The requested file could not be loaded from Box");
}