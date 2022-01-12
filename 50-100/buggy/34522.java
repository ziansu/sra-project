public int compareTo(java.lang.Object o) {
    net.sf.memoranda.Task task = ((net.sf.memoranda.Task) (o));
    if ((getRate()) > (task.getRate()))
        return 1;
    else
        if ((getRate()) < (task.getRate()))
            return -1;
        else
            return 0;
        
    
}