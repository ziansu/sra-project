private boolean sameAddresses(@android.support.annotation.NonNull
java.util.List<gcum.gcumfisher.Spot> addresses1, @android.support.annotation.NonNull
java.util.List<gcum.gcumfisher.Spot> addresses2) {
    if ((addresses1.size()) != (addresses2.size()))
        return false;
    
    for (gcum.gcumfisher.Spot spot : addresses2)
        if (addresses1.contains(spot))
            return false;
        
    
    return true;
}