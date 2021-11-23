public synchronized java.lang.String getSpeed(long size) {
    long t2 = java.lang.System.currentTimeMillis();
    long t = t2 - (t1);
    t1 = t2;
    if (t == 0)
        return "MAX";
    
    sum += size;
    return java.lang.String.format("%,dKB/s avg. %,dKB/s, sum=%,dbytes", (size / t), ((sum) / (t2 - (t0))), sum);
}