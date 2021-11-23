@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot snapshot) {
    CentralData.myRides.clear();
    for (com.firebase.client.DataSnapshot postSnapshot : snapshot.getChildren()) {
        java.lang.String key1 = postSnapshot.getKey();
        java.lang.String value = postSnapshot.toString();
        boolean inRide = value.toLowerCase().contains(CentralData.uid.toLowerCase());
        if (inRide) {
            CentralData.myRides.add(key1);
        }
    }
}