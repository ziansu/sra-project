public boolean sendRequest(edu.umass.cs.gigapaxos.interfaces.Request request, edu.umass.cs.gigapaxos.interfaces.RequestCallback callback) throws java.io.IOException {
    if (request instanceof edu.umass.cs.reconfiguration.reconfigurationpackets.ClientReconfigurationPacket) {
        return this.sendRequest(((edu.umass.cs.reconfiguration.reconfigurationpackets.ClientReconfigurationPacket) (request)), callback);
    }else
        return (request instanceof edu.umass.cs.gigapaxos.interfaces.ClientRequest ? this.sendRequest(((edu.umass.cs.gigapaxos.interfaces.ClientRequest) (request)), callback) : this.sendRequest(edu.umass.cs.reconfiguration.reconfigurationpackets.ReplicableClientRequest.wrap(request), callback)) != null;
    
}