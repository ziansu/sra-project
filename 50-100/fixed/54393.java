@org.junit.Test
public void viewAllPermissions() {
    int userId = 2;
    org.activityinfo.store.spi.FormPermissions permissions = catalog.getForm(activityFormClass(1)).get().getPermissions(userId);
    assertThat(permissions.isVisible(), equalTo(true));
    assertThat(permissions.isEditAllowed(), equalTo(true));
    assertThat(permissions.getVisibilityFilter(), nullValue());
}