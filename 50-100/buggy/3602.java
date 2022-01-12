@org.junit.Test
public void testCTor() {
    jmri.jmrix.can.TrafficControllerScaffold tc = new jmri.jmrix.can.TrafficControllerScaffold();
    jmri.jmrix.can.CanSystemConnectionMemo memo = new jmri.jmrix.can.CanSystemConnectionMemo();
    memo.setTrafficController(tc);
    jmri.jmrix.can.cbus.CbusDccProgrammerManager t = new jmri.jmrix.can.cbus.CbusDccProgrammerManager(new jmri.jmrix.can.cbus.CbusDccProgrammer(tc, memo));
    org.junit.Assert.assertNotNull("exists", t);
}