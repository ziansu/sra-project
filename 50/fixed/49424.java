@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot snapshot) {
    exists = snapshot.hasChild(game_id);
    java.lang.System.out.println(exists);
}