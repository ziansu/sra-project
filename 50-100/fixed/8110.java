@org.junit.Test
public void testOnSelectApproveUserAccess() {
    controller.configure(mockActionMenu, entityBundle, true, wikiPageId, mockEntityUpdatedHandler);
    controller.onAction(Action.APPROVE_USER_ACCESS);
    org.mockito.Mockito.verify(mockApproveUserAccessModal).configure(entityBundle);
    org.mockito.Mockito.verify(mockApproveUserAccessModal).show();
}