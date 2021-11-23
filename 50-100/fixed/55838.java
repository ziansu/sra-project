public net.sf.memoranda.Task getSubTask(java.lang.String id) {
    java.util.Iterator<net.sf.memoranda.Task> iter = subTasks.iterator();
    while (iter.hasNext()) {
        net.sf.memoranda.Task t = iter.next();
        if (t.getID().equals(id))
            return t;
        
    } 
    return null;
}