@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot snapshot) {
    if (snapshot.exists()) {
        startActivity(feedIntent);
        startActivity(feedIntent);
    }else {
        startActivity(profileIntent);
    }
}