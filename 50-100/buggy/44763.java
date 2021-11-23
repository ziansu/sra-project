@org.junit.Test
public void revokedPermissions() {
    int christianUserId = 5;
    org.activityinfo.store.spi.FormPermissions permissions = catalog.getForm(activityFormClass(1)).get().getPermissions(christianUserId);
    assertThat(permissions.isVisible(), org.hamcrest.Matchers.equalTo(false));
    assertThat(permissions.isEditAllowed(), org.hamcrest.Matchers.equalTo(false));
    assertThat(permissions.getVisibilityFilter(), nullValue());
}