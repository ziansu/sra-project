@java.lang.Override
public int compare(com.osu.kusold.roar.EventPost a, com.osu.kusold.roar.EventPost b) {
    if ((userLoc) != null) {
        android.location.Location eventLocA = setEventLocation(a);
        android.location.Location eventLocB = setEventLocation(b);
        float distanceA = userLoc.distanceTo(eventLocA);
        float distanceB = userLoc.distanceTo(eventLocB);
        if (distanceA < distanceB) {
            return 1;
        }else
            return -1;
        
    }else {
        return 0;
    }
}