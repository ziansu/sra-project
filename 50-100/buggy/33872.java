public com.insframe.server.model.Task findTaskById(java.lang.String assignmentId, java.lang.String taskId, java.lang.Boolean addAttachmentDetails) throws com.insframe.server.error.AssignmentAccessException, com.insframe.server.error.AssignmentStorageException, com.insframe.server.error.UserAccessException {
    com.insframe.server.model.Task queriedTask = findById(assignmentId, addAttachmentDetails).getTask(taskId);
    if (queriedTask != null) {
        return queriedTask;
    }else {
        throw new com.insframe.server.error.AssignmentAccessException(com.insframe.server.error.AssignmentAccessException.TASK_ID_NOT_FOUND_TEXT_ID, new java.lang.String[]{ assignmentId , taskId });
    }
}