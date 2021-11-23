@asg.cliche.Command(description = "Delete a RequestRouter cluster")
public java.lang.String deletecluster(@asg.cliche.Param(name = "ClusterIP", description = "The IP address for the RequestRouter cluster")
java.lang.String IP, @asg.cliche.Param(name = "ClusterPort", description = "The TCP port for the RequestRouter cluster")
java.lang.String Port) {
    try {
        boolean result = this.context.deleteCluster(new pt.ulisboa.tecnico.amorphous.requestrouter.internal.RequestRouterCluster(java.net.InetAddress.getByName(IP), java.lang.Integer.valueOf(Port)));
        if (result)
            return (("Added cluster " + IP) + ":") + Port;
        else
            return "Failed to remove the cluster";
        
    } catch (java.net.UnknownHostException | java.lang.NumberFormatException e) {
        return "An error occurred: " + (e.getStackTrace().toString());
    }
}