public net.javacoding.jspider.core.task.work.DecideOnSpideringTask[] unblock(java.net.URL siteURL) {
    java.util.ArrayList<net.javacoding.jspider.core.task.work.DecideOnSpideringTask> al = blocked.remove(siteURL);
    if (al == null) {
        return new net.javacoding.jspider.core.task.work.DecideOnSpideringTask[0];
    }else {
        synchronized(al) {
            blockedCount -= al.size();
            return al.toArray(new net.javacoding.jspider.core.task.work.DecideOnSpideringTask[al.size()]);
        }
    }
}