public void run() {
    while (!(closed)) {
        xyz.yidea.ThreadPool.Task task = null;
        synchronized(pools) {
            if (pools.isEmpty()) {
                try {
                    pools.wait();
                } catch (java.lang.InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                task = pools.removeLast();
            }
        }
        state = true;
        if (null != task)
            task.run();
        
        state = false;
    } 
}