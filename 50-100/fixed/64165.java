@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onServerTick(net.minecraftforge.fml.common.gameevent.TickEvent.ServerTickEvent e) {
    synchronized(taskQueue) {
        if (((e.phase) != (TickEvent.Phase.START)) || (taskQueue.isEmpty())) {
            return ;
        }
        for (java.lang.Runnable task : taskQueue) {
            task.run();
        }
        taskQueue.clear();
    }
}