private synchronized java.lang.String getIPAddress() {
    java.lang.String IPAddress = null;
    try {
        if ((edu.tomr.loadbalancer.ClientConnectionHandler.turnOf) == ((edu.tomr.utils.ConfigParams.getIpAddresses().size()) - 1)) {
            edu.tomr.loadbalancer.ClientConnectionHandler.turnOf = 0;
            IPAddress = edu.tomr.utils.ConfigParams.getIpAddresses().get(edu.tomr.loadbalancer.ClientConnectionHandler.turnOf);
        }else {
            IPAddress = edu.tomr.utils.ConfigParams.getIpAddresses().get(edu.tomr.loadbalancer.ClientConnectionHandler.turnOf);
            (edu.tomr.loadbalancer.ClientConnectionHandler.turnOf)++;
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Error while trying to access the IP Addresses for scheduling");
        e.printStackTrace();
    }
    return IPAddress;
}