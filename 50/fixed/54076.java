@java.lang.Override
public void detach() {
    org.percepta.mgrankvi.demo.Broadcaster.unregister(this);
    if ((player) != null) {
        org.percepta.mgrankvi.demo.Broadcaster.broadcastPlayer(mapParam, player, true);
    }
    super.detach();
}