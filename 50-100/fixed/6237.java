public void getDevices() {
    devices.removeAll();
    int r = org.jnetpcap.Pcap.findAllDevs(alldevs, errbuf);
    if ((r == (org.jnetpcap.Pcap.NOT_OK)) || (alldevs.isEmpty())) {
        java.lang.System.err.printf("Can't read list of devices, error is %s", errbuf.toString());
    }else {
        for (org.jnetpcap.PcapIf alldev : alldevs) {
            devices.add(alldev.getName());
        }
    }
}