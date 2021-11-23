@java.lang.Override
public void run() {
    try {
        loadPlayerData(player);
    } catch (java.lang.Exception e) {
        throw e;
    } finally {
        locked.remove(player.getName());
    }
}