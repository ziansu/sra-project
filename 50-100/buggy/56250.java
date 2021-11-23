@org.springframework.web.bind.annotation.RequestMapping(value = "/srun", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public void runSequentialExp() throws java.lang.Exception {
    java.lang.String pcapPath = "/home/vagrant/darshini/data/packet/packet_data.pcap";
    java.lang.String protocolGraphStr = "graph start {\n\tethernet;\n}\ngraph ethernet {\n\tswitch(ethertype) {\n\t\tcase 0800:\t\t\t ipv4;\n\t}\n}\ngraph ipv4 {\n\tswitch(protocol) {\n\t\tcase 06: tcp;\n\t}\n}\ngraph tcp {\n}\ngraph end {\n}";
    log.info("EXECUTING IN THREAD");
    exp1.call(pcapPath, protocolGraphStr);
    java.util.concurrent.TimeUnit.SECONDS.sleep(10);
    exp2.call(pcapPath, protocolGraphStr);
    log.info("FINISHED");
}