synchronized void tick() {
    (mTickCount)++;
    while ((!(mQueue.isEmpty())) && ((mQueue.get(0).mDueTickCount) <= (mTickCount))) {
        ch.logixisland.anuto.game.engine.MessageQueue.Message message = mQueue.remove(0);
        message.mRunnable.run();
    } 
}