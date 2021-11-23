@java.lang.Override
public synchronized void update(java.util.Observable arg0, java.lang.Object arg1) {
    if (arg0 instanceof TrivaGameServer.TrivaGameServer) {
        TrivaGameServer.TrivaGameServer caller = ((TrivaGameServer.TrivaGameServer) (arg0));
        if ((caller.isRunning()) && (caller.getMessage().addr.equals(groupIp)))
            msgQueue.add(caller.getMessage());
        else
            run = false;
        
    }
}