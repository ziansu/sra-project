@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    for (com.firebase.client.DataSnapshot child : dataSnapshot.getChildren()) {
        arrayList.add(child.child("users").getChildren());
    }
    if ((arrayList.size()) != 0) {
        android.util.Log.v(edu.uw.samueldc.assassin_manager.MapFragment.TAG, arrayList.get(0).toString());
    }
}