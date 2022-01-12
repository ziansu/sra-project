private boolean sameAddresses(@android.support.annotation.NonNull
java.util.List<gcum.gcumfisher.Spot> addresses1, @android.support.annotation.NonNull
java.util.List<gcum.gcumfisher.Spot> addresses2) {
    if ((addresses1.size()) != (addresses2.size()))
        return false;
    
    for (int i = 0; i < (addresses1.size()); i++)
        if (!(addresses1.get(i).equals(addresses2.get(i))))
            return false;
        
    
    return true;
}