public boolean stop() {
    synchronized(this) {
        if (!(stopped))
            stopped = true;
        else
            throw new it.unipd.math.pcd.actors.exceptions.NoSuchActorException();
        
    }
    return stopped;
}