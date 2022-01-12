@java.lang.Override
public void onChildAdded(com.bloodport.fragment.DataSnapshot dataSnapshot, java.lang.String previousChild) {
    requests.add(0, dataSnapshot.getValue(com.bloodport.model.BloodRequest.class));
    adapter.notifyDataSetChanged();
}