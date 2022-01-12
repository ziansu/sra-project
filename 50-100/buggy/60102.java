private java.util.Collection filterActiveTasks(java.util.Collection tasks, net.sf.memoranda.date.CalendarDate date) {
    java.util.Vector v = new java.util.Vector();
    for (java.util.Iterator iter = tasks.iterator(); iter.hasNext();) {
        net.sf.memoranda.Task t = ((net.sf.memoranda.Task) (iter.next()));
        if (isActive(t, date)) {
            v.add(t);
        }
    }
    return v;
}