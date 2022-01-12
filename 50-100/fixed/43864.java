synchronized void tick() {
    (mTickCount)++;
    while ((!(mQueue.isEmpty())) && ((mTickCount) >= (mQueue.get(0).mDueTickCount))) {
        ch.logixisland.anuto.game.engine.MessageQueue.Message message = mQueue.remove(0);
        message.mRunnable.run();
    } 
}