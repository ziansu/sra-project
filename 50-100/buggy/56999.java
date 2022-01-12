@org.junit.Test
public void createsOperationDeleteAllCommentsTypesAtFirst() {
    final java.util.ArrayList<android.content.ContentProviderOperation> operations = new com.codefactoring.android.backlogtracker.sync.handlers.CommentDataHandler().makeContentProviderOperations(new java.util.HashSet<com.codefactoring.android.backlogtracker.sync.models.CommentDto>());
    final android.content.ContentProviderOperation operation = operations.get(com.codefactoring.android.backlogtracker.sync.handlers.CommentDataHandlerTest.INDEX_TYPE_DELETE);
    org.hamcrest.MatcherAssert.assertThat(operation.getUri(), org.hamcrest.CoreMatchers.equalTo(BacklogContract.CommentEntry.CONTENT_URI));
    final org.robolectric.shadows.ShadowContentProviderOperation shadowOperation = org.robolectric.Shadows.shadowOf(operation);
    org.hamcrest.MatcherAssert.assertThat(shadowOperation.getType(), org.hamcrest.CoreMatchers.equalTo(org.robolectric.shadows.ShadowContentProviderOperation.TYPE_DELETE));
}