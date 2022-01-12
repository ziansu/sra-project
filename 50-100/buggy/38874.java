@org.junit.Test
public void returnsSerialConnectionWhenAvailableAndFallsbackToFirstAvailable() throws java.io.IOException {
    org.ardulink.core.Link link = org.ardulink.core.convenience.Links.getDefault();
    org.ardulink.core.Connection connection = getConnection(link);
    org.junit.Assert.assertThat(connection.getClass().getName(), org.hamcrest.core.Is.is(org.ardulink.core.linkmanager.DummyConnection.class.getName()));
    close(link);
}