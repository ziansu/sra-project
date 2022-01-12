@java.lang.Override
public void run() {
    while (true) {
        for (java.util.Map.Entry<server.Key, server.BlockInstance> entrySet : server.QueueHandlerThread.HT.entrySet()) {
            server.Key key = entrySet.getKey();
            server.BlockInstance BI = entrySet.getValue();
            if ((BI.LookedByQueue) == false) {
                BI.LookedByQueue = true;
                AddTaskToQueue(BI, key);
            }
        }
    } 
}