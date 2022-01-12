@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot snapshot) {
    for (com.firebase.client.DataSnapshot postSnapshot : snapshot.getChildren()) {
        com.kaylaflaten.organicfarm.Entry cropEntry = postSnapshot.getValue(com.kaylaflaten.organicfarm.Entry.class);
        java.lang.String key = postSnapshot.getKey();
        if (!(keys.contains(key))) {
            keys.add(key);
            aa.add(cropEntry.getName());
        }
    }
}