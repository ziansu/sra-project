@java.lang.Override
public boolean isWaiting() {
    boolean waiting = false;
    for (cs361Project.Runner r : getRunners()) {
        if (r == null)
            break;
        else
            if ((r.getStartTime()) == null)
                waiting = true;
            
        
    }
    return waiting;
}