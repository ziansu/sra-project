public void run() {
    while (true) {
        try {
            java.lang.System.out.println("Before publish!");
            edu.illinois.adsc.Benchmark.Tuple tuple = new edu.illinois.adsc.Benchmark.Tuple(edu.illinois.adsc.Benchmark._tupleSize);
            java.lang.System.out.println(("published!" + ((count)++)));
            tuple.randomGen();
            tuple.setKey(java.lang.System.currentTimeMillis());
            queue.publish(java.lang.System.currentTimeMillis(), true);
        } catch (com.lmax.disruptor.InsufficientCapacityException e) {
            java.lang.System.err.println(e.getMessage());
            return ;
        }
    } 
}