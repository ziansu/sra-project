public void handle(java.io.File f, mlga.io.peer.Event e) {
    if (e == (Event.DELETE))
        return ;
    
    if (!(f.getName().endsWith(".log")))
        return ;
    
    processLog(f);
}