public final void run() {
    if ((stop) && (owner.withinRange(location, radius))) {
        owner.resetPath();
        arrived();
    }else
        if (owner.hasMoved()) {
            return ;
        }else
            if (owner.withinRange(location, radius)) {
                arrived();
            }
        
    
    super.matchRunning = false;
}