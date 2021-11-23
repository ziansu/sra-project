@java.lang.Override
public void onScreenOff() {
    if (isScreenOn)
        queue.put(new de.familiep.mobileinformationgain.queue.InformationData(null, 0, java.lang.System.currentTimeMillis(), null, true));
    
    isScreenOn = false;
}