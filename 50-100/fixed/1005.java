public void join() throws java.lang.InterruptedException {
    pt.it.av.atnog.utils.parallel.Stop stop = new pt.it.av.atnog.utils.parallel.Stop();
    sink.put(stop);
    for (int i = 0; i < (queues.size()); i++) {
        workers.get(i).join();
        queues.get(i).put(stop);
    }
    workers.get(((workers.size()) - 1)).join();
    source.add(stop);
}