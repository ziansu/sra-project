@java.lang.Override
public void operationComplete(int rc, java.lang.Void v) {
    if (rc == (BKException.Code.OK)) {
        synchronized(waitingForAuth) {
            authenticated = true;
            org.jboss.netty.channel.MessageEvent e = waitingForAuth.poll();
            while (e != null) {
                ctx.sendDownstream(e);
                e = waitingForAuth.poll();
            } 
        }
    }else {
        authenticationError(ctx, rc);
        org.apache.bookkeeper.proto.AuthHandler.LOG.debug("Authentication failed on server side");
    }
}