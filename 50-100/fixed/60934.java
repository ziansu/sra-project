@java.lang.Override
public boolean isActive() {
    boolean active = false;
    for (cs361Project.Runner r : getRunners()) {
        if (r == null)
            break;
        else
            if (((r.getStartTime()) != null) && (!(getFinished().contains(r))))
                active = true;
            
        
    }
    return active;
}