private void start() {
    java.lang.System.out.println("DistrictServer Started\n");
    try {
        districtComm = new FinalProject.communication.Comm(port);
        districtComm.connectToParent(java.net.InetAddress.getByName(masterAddress), masterPort);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    this.run();
}