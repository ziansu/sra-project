@org.junit.Test
public void publicPermission() {
    org.activityinfo.model.resource.ResourceId publicFormClassId = activityFormClass(41);
    org.activityinfo.store.spi.FormPermissions permissions = catalog.getForm(publicFormClassId).get().getPermissions(999);
    assertThat(permissions.isVisible(), org.hamcrest.Matchers.equalTo(true));
    assertThat(permissions.getVisibilityFilter(), nullValue());
    assertThat(permissions.isEditAllowed(), org.hamcrest.Matchers.equalTo(false));
}