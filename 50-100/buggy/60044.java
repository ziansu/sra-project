@java.lang.Override
public <T extends com.rapid7.client.dcerpc.RPCResponse> T transact(final com.rapid7.client.dcerpc.RPCRequest<T> request) throws java.io.IOException {
    final int callID;
    synchronized(this) {
        callID = (this.callID)++;
    }
    final byte[] requestBytes = request.marshal(callID);
    final byte[] responseBytes = new byte[com.rapid7.client.dcerpc.transport.SMBTransport.MAXIMUM_TRANSACT_SIZE];
    namedPipe.transact(requestBytes, responseBytes);
    return request.unmarshal(responseBytes, callID);
}