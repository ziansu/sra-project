@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    newfriends.add(dataSnapshot.getValue(com.mti.meetme.Model.User.class));
    adapterNFriend.notifyDataSetChanged();
    ((android.widget.TextView) (getView().findViewById(R.id.demande))).setVisibility(View.VISIBLE);
    if ((friends.size()) != 0)
        ((android.widget.TextView) (getView().findViewById(R.id.friendsTxt))).setVisibility(View.VISIBLE);
    
}