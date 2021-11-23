private void gotGlobalReqResponse(net.schmizz.sshj.common.SSHPacket response) throws net.schmizz.sshj.connection.ConnectionException {
    synchronized(globalReqPromises) {
        net.schmizz.concurrent.Promise<net.schmizz.sshj.common.SSHPacket, net.schmizz.sshj.connection.ConnectionException> gr = globalReqPromises.poll();
        if (gr == null)
            throw new net.schmizz.sshj.connection.ConnectionException(net.schmizz.sshj.common.DisconnectReason.PROTOCOL_ERROR, "Got a global request response when none was requested");
        else
            if (response == null)
                gr.deliverError(new net.schmizz.sshj.connection.ConnectionException((("Global request [" + gr) + "] failed")));
            else
                gr.deliver(response);
            
        
    }
}