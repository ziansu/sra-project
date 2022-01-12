@java.lang.Override
public boolean isWaiting() {
    boolean waiting = false;
    for (cs361Project.Runner r : getRunners()) {
        if (r == null)
            waiting = true;
        else
            if ((r.getStartTime()) == null)
                waiting = true;
            
        
    }
    return waiting;
}