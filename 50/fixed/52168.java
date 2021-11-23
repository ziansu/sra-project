@java.lang.Override
public synchronized void onBattleCompleted(com.hutgroup.robocode.server.BattleCompletedEvent e) {
    notifyAll();
}