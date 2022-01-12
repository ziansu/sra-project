@org.junit.Test
public void should_exec_cli_remote() throws com.jcraft.jsch.JSchException, java.io.IOException {
    java.lang.String uci_show = "uci show ";
    java.lang.String wan_ifname = "network.wan.ifname";
    java.lang.String re = gw.remoteExec((uci_show + wan_ifname));
    assertTrue(re.contains(gw.readProp("CPE.network.wan.if")));
}