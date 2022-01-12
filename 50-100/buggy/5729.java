@org.junit.Test
public void canCloseConnection() throws java.lang.Exception {
    org.ardulink.core.Link link = getRandomLink();
    org.ardulink.core.linkmanager.DummyConnection connection = getConnection(link);
    org.junit.Assert.assertThat(connection.getCloseCalls(), org.hamcrest.core.Is.is(0));
    close(link);
    org.junit.Assert.assertThat(connection.getCloseCalls(), org.hamcrest.core.Is.is(1));
}