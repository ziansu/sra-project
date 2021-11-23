public void fcfs_schedule(java.lang.Long t) {
    while (it.hasNext()) {
        java.lang.Process p = it.next();
        if (((long) (p.getArrivalTime())) == t) {
            queue.add(p);
        }else
            if (((long) (p.getArrivalTime())) > t) {
                break;
            }
        
    } 
    it.previous();
}