@java.lang.Override
public void detach() {
    if ((player) != null)
        org.percepta.mgrankvi.demo.Broadcaster.broadcastPlayer(mapParam, player, true);
    
    org.percepta.mgrankvi.demo.Broadcaster.unregister(this);
    super.detach();
}