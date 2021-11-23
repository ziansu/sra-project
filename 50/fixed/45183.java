@org.junit.Before
public void setUp() {
    jmri.util.JUnitUtil.resetInstanceManager();
    tc = new jmri.jmrix.ieee802154.xbee.XBeeInterfaceScaffold();
    m = new jmri.jmrix.ieee802154.xbee.XBeeConnectionMemo();
    m.setSystemPrefix("ABC");
    tc.setAdapterMemo(m);
}