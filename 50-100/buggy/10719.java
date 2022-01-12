@java.lang.Override
public synchronized boolean isOwnedBy(java.lang.Thread t) {
    if (((currentOwner) == t) && (t.isAlive())) {
        return true;
    }else
        if (((currentOwner) == null) && ((t == null) || (t.isAlive()))) {
            return true;
        }else {
            return false;
        }
    
}