@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    list = new java.util.ArrayList<>();
    for (com.google.firebase.database.DataSnapshot ds : dataSnapshot.getChildren()) {
        com.example.user.datascienceapp.Story story = ds.getValue(com.example.user.datascienceapp.Story.class);
        list.add(story);
    }
    text = true;
    android.util.Log.d("ListSize", ((list.size()) + ""));
    android.util.Log.d("Data", ((count) + ""));
    check(count);
}