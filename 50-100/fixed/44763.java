@org.junit.Test
public void revokedPermissions() {
    int christianUserId = 5;
    org.activityinfo.store.spi.FormPermissions permissions = catalog.getForm(activityFormClass(1)).get().getPermissions(christianUserId);
    assertThat(permissions.isVisible(), equalTo(false));
    assertThat(permissions.isEditAllowed(), equalTo(false));
    assertThat(permissions.getVisibilityFilter(), nullValue());
}