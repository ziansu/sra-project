@java.lang.Override
public synchronized void onCellLocationChanged(android.telephony.CellLocation location) {
    super.onCellLocationChanged(location);
    curr = ryey.easer.plugins.event.celllocation.CellLocationSingleData.fromCellLocation(location);
    if ((type) == (ryey.easer.commons.plugindef.eventplugin.EventType.any)) {
        changeSatisfiedState(target.contains(curr));
    }else
        if ((type) == (ryey.easer.commons.plugindef.eventplugin.EventType.none)) {
            changeSatisfiedState((!(target.contains(curr))));
        }
    
}