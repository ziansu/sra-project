@org.junit.Test
@com.autonomy.abc.base.Role(value = com.autonomy.abc.selenium.find.application.UserRole.FIND)
public void testRefreshWithSlash() {
    final java.lang.String query = "foo/bar";
    search(query);
    getDriver().navigate().refresh();
    assertThat(getElementFactory().getSearchBox().getValue(), org.hamcrest.core.Is.is(query));
}