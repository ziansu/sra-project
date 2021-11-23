public int compareTo(net.sf.memoranda.Task task) {
    if ((getRate()) > (task.getRate()))
        return 1;
    else
        if ((getRate()) < (task.getRate()))
            return -1;
        else
            return 0;
        
    
}