private void start() {
    java.lang.System.out.println("DistrictServer Started\n");
    try {
        districtComm = new FinalProject.communication.Comm(port);
        districtComm.connectToParent(java.net.InetAddress.getByName(masterAddress), masterPort);
        java.lang.Thread.sleep(1000);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    this.run();
}