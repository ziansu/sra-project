@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    java.util.HashMap<java.lang.String, java.lang.Object> Data = ((java.util.HashMap<java.lang.String, java.lang.Object>) (dataSnapshot.getValue()));
    v6.caique.ExploreFragment.Chats.get(s).Title = ((java.lang.String) (Data.get("title")));
    v6.caique.ExploreFragment.Chats.get(s).Tags = ((java.util.ArrayList<java.lang.String>) (Data.get("tags")));
    ReloadViews(s);
}