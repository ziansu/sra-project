@java.lang.Override
public boolean contains(java.lang.Object s) {
    java.util.Iterator<T> itr = this.iterator();
    if (s == null)
        return false;
    else
        while (itr.hasNext())
            if (((java.lang.String) (s)).equalsIgnoreCase(itr.next()))
                return true;
            
        
    
    return false;
}