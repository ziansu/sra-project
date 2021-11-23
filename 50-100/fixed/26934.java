@java.lang.Override
public void run() {
    for (int i = start; i < end; i++)
        cache[i] = jsat.linear.VecOps.weightedDot(invStndDevs, vecs.get(i), vecs.get(i));
    
    latch.countDown();
}