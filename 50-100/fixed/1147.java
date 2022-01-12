protected void assertAccessException(final org.projectforge.framework.access.AccessException ex, final java.lang.Integer taskId, final org.projectforge.framework.access.AccessType accessType, final org.projectforge.framework.access.OperationType operationType) {
    assertEquals(accessType, ex.getAccessType());
    assertEquals(operationType, ex.getOperationType());
    assertEquals(taskId, ex.getTaskId());
}