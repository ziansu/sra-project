public void run() {
    while (true) {
        try {
            edu.illinois.adsc.Benchmark.Tuple tuple = new edu.illinois.adsc.Benchmark.Tuple(edu.illinois.adsc.Benchmark._tupleSize);
            tuple.randomGen();
            tuple.setKey(java.lang.System.currentTimeMillis());
            queue.publish(tuple, true);
        } catch (com.lmax.disruptor.InsufficientCapacityException e) {
            java.lang.System.err.println(e.getMessage());
            return ;
        }
    } 
}