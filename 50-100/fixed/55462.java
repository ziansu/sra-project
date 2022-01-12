@java.lang.Override
public void update(java.util.Observable arg0, java.lang.Object arg1) {
    if (arg0 instanceof TrivaGameServer.TrivaGameServer) {
        TrivaGameServer.TrivaGameServer caller = ((TrivaGameServer.TrivaGameServer) (arg0));
        if (caller.isRunning()) {
            if (caller.getMessage().groupIp.equals(groupIp))
                msgQueue.add(caller.getMessage());
            
        }else
            run = false;
        
    }
}