@java.lang.Override
public void onFailure(java.lang.Exception exception) {
    scheduleCleanup(createdRecipientId);
    fail(exception.getMessage());
}