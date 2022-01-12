@java.lang.Override
public synchronized boolean isOwnedBy(java.lang.Thread t) {
    if (t == null) {
        if (((this.currentOwner) == null) || (!(this.currentOwner.isAlive())))
            return true;
        else
            return false;
        
    }else
        if (t.isAlive()) {
            if ((this.currentOwner) == t)
                return true;
            else
                return false;
            
        }else
            return false;
        
    
}