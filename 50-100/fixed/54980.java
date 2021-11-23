@org.junit.Test
public void publicPermission() {
    org.activityinfo.model.resource.ResourceId publicFormClassId = activityFormClass(41);
    org.activityinfo.store.spi.FormPermissions permissions = catalog.getForm(publicFormClassId).get().getPermissions(999);
    assertThat(permissions.isVisible(), equalTo(true));
    assertThat(permissions.getVisibilityFilter(), nullValue());
    assertThat(permissions.isEditAllowed(), equalTo(false));
}