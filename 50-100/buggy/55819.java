public void join() {
    this.threads[0].run();
    java.lang.System.out.println("Main thread will now wait for worker threads");
    for (int thread = 1; thread < (configuration.Configuration.hybrid_threads); thread++) {
        java.lang.System.out.println(((("Thread " + thread) + " state: ") + (this.threads[thread].getState())));
        while ((this.threads[thread].getState()) != (java.lang.Thread.State.WAITING)) {
        } 
    }
    java.lang.System.out.println("Main thread finished join");
}