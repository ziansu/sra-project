@java.lang.Override
public void run() {
    try {
        java.lang.Thread.sleep(10000);
        _p.revive();
        _player.put(P_ID, _p);
        java.lang.System.out.println("Revive");
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}