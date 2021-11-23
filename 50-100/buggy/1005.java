public void join() throws java.lang.InterruptedException {
    pt.it.av.atnog.utils.parallel.Stop stop = new pt.it.av.atnog.utils.parallel.Stop();
    sink.put(stop);
    for (java.util.concurrent.BlockingQueue<java.lang.Object> q : queues)
        q.put(stop);
    
    for (pt.it.av.atnog.utils.parallel.Worker w : workers)
        w.join();
    
    source.add(stop);
}