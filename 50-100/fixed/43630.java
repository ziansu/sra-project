@org.junit.Test
public void editAllPermissions() {
    int userId = 3;
    org.activityinfo.store.spi.FormPermissions permissions = catalog.getForm(activityFormClass(1)).get().getPermissions(userId);
    assertThat(permissions.isVisible(), equalTo(true));
    assertThat(permissions.isEditAllowed(), equalTo(true));
    assertThat(permissions.getVisibilityFilter(), nullValue());
    assertThat(permissions.getEditFilter(), nullValue());
}