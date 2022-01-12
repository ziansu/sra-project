int cpu_quantum() {
    if (queue.isEmpty())
        return 0;
    else {
        java.lang.Process p = queue.getFirst();
        p.decrement_time();
        if ((p.getTime()) <= 0) {
            queue.removeFirst();
            remainingQ = qTime;
        }
        return p.getNumber();
    }
}