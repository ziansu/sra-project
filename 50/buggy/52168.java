@java.lang.Override
public synchronized void onBattleCompleted(com.hutgroup.robocode.server.BattleCompletedEvent e) {
    java.lang.System.out.println(e);
    java.lang.System.out.println(roundResults);
    notifyAll();
}