@org.junit.Test
public void serverNameNotNullTest() {
    assertThat(infoDataGuard.serverName(), not(null));
}