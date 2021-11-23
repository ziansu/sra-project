@org.junit.Test
public java.lang.String serverNameNotNullTest() {
    assertThat(infoDataGuard.serverName(), not(null));
}