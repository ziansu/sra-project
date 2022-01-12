@org.junit.Test
public void editPartnerPermissions() {
    int userId = 4;
    org.activityinfo.store.spi.FormPermissions permissions = catalog.getForm(activityFormClass(1)).get().getPermissions(userId);
    assertThat(permissions.isVisible(), equalTo(true));
    assertThat(permissions.isEditAllowed(), equalTo(true));
    assertThat(permissions.getVisibilityFilter(), org.hamcrest.CoreMatchers.equalTo("a00000000010000000007 == \"p0000000002\""));
    assertThat(permissions.getEditFilter(), org.hamcrest.CoreMatchers.equalTo("a00000000010000000007 == \"p0000000002\""));
}