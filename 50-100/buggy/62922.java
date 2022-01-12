@java.lang.Override
public void handle(se.sics.ktoolbox.ipsolver.msg.GetIp.Resp resp) {
    se.kth.ws.aggregator.ws.VisualizerLauncher.logger.info("starting: setting up caracal connection");
    if (!(resp.addrs.isEmpty())) {
        ip = resp.addrs.get(0).getAddr();
        if ((resp.addrs.size()) > 1) {
            se.kth.ws.aggregator.ws.VisualizerLauncher.logger.warn("multiple ips detected, proceeding with:{}", ip);
        }
    }
    com.typesafe.config.Config config = com.typesafe.config.ConfigFactory.load();
    builder = new se.sics.p2ptoolbox.util.helper.SystemConfigBuilder(config).setSelfIp(ip);
    initiatingPhase2();
}