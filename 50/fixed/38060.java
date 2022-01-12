@java.lang.Override
public void run() {
    if ((commands) != null)
        commands.stop();
    
    if ((packets) != null)
        packets.stop();
    
    if ((con) != null)
        con.close();
    
}