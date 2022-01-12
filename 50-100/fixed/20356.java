@org.junit.Test
public void ownerPermissions() {
    int ownerUserId = 1;
    org.activityinfo.store.spi.FormPermissions permissions = catalog.getForm(activityFormClass(1)).get().getPermissions(ownerUserId);
    assertThat(permissions.isVisible(), equalTo(true));
    assertThat(permissions.isEditAllowed(), equalTo(true));
    assertThat(permissions.getVisibilityFilter(), nullValue());
}