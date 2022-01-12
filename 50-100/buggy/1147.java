protected void assertAccessException(final org.projectforge.framework.access.AccessException ex, final java.lang.Integer taskId, final org.projectforge.framework.access.AccessType accessType, final org.projectforge.framework.access.OperationType operationType) {
    org.testng.AssertJUnit.assertEquals(accessType, ex.getAccessType());
    org.testng.AssertJUnit.assertEquals(operationType, ex.getOperationType());
    org.testng.AssertJUnit.assertEquals(taskId, ex.getTaskId());
}