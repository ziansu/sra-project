@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    org.thehellnet.shab.protocol.entity.Hab hab = shabContext.getHab();
    if (hab == null) {
        return ;
    }
    updateHabMarker(hab.getPosition().getLatitude(), hab.getPosition().getLongitude());
}