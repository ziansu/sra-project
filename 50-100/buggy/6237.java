public void getDevices() {
    int r = org.jnetpcap.Pcap.findAllDevs(alldevs, errbuf);
    if ((r == (org.jnetpcap.Pcap.NOT_OK)) || (alldevs.isEmpty())) {
        java.lang.System.err.printf("Can't read list of devices, error is %s", errbuf.toString());
    }else {
        java.lang.System.out.println(r);
        devices.removeAll();
        for (org.jnetpcap.PcapIf alldev : alldevs) {
            devices.add(alldev.getName());
        }
    }
}