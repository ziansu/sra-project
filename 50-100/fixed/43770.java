public java.util.Collection<polyglot.frontend.Job> jobs() {
    java.util.ArrayList<polyglot.frontend.Job> l = new java.util.ArrayList<polyglot.frontend.Job>(jobs.size());
    for (java.util.Iterator<polyglot.frontend.Job> i = jobs.values().iterator(); i.hasNext();) {
        polyglot.frontend.Job job = i.next();
        if (!(job.completed())) {
            l.add(job);
        }
    }
    return l;
}