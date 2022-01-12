protected void setUp() throws java.lang.Exception {
    apps.tests.Log4JFixture.setUp();
    super.setUp();
    m = new jmri.jmrix.ieee802154.serialdriver.SerialTrafficController();
}