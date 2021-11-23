public void unloadParcel() {
    java.util.LinkedList<courier.Parcel> carryingCopy = ((java.util.LinkedList<courier.Parcel>) (carrying.clone()));
    for (courier.Parcel p : carryingCopy) {
        if (p.destination.equals(currStation)) {
            pickOut(p);
            (map.parcelArrivedTotal)++;
            if ((carrying.indexOf(p)) == 0)
                initCarState();
            
        }
    }
}