@java.lang.Override
public void onAddressToLocation(java.lang.Object obj) {
    synchronized(this) {
        if (obj instanceof android.location.Location) {
            setLocation(((android.location.Location) (obj)));
            state = cse403.homesafe.Data.Destination.STATE.READY;
        }else {
            state = cse403.homesafe.Data.Destination.STATE.ERROR;
            android.util.Log.e(cse403.homesafe.Data.Destination.TAG, "Calculate location error");
        }
        notifyAll();
    }
}