@org.junit.Test
public void isConfiguredForAllChoiceValues() throws java.io.IOException {
    org.ardulink.core.Link link = org.ardulink.core.convenience.Links.getDefault();
    org.ardulink.core.linkmanager.DummyLinkConfig config = getConnection(link).getConfig();
    assertThat(config.getA(), org.hamcrest.core.Is.is("aVal1"));
    close(link);
}