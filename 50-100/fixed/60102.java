private java.util.Collection<net.sf.memoranda.Task> filterActiveTasks(java.util.Collection<net.sf.memoranda.Task> tasks, net.sf.memoranda.date.CalendarDate date) {
    java.util.Vector<net.sf.memoranda.Task> v = new java.util.Vector<net.sf.memoranda.Task>();
    for (java.util.Iterator<net.sf.memoranda.Task> iter = tasks.iterator(); iter.hasNext();) {
        net.sf.memoranda.Task t = iter.next();
        if (isActive(t, date)) {
            v.add(t);
        }
    }
    return v;
}