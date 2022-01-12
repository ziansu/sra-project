@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    messageList.clear();
    for (com.google.firebase.database.DataSnapshot messageShot : dataSnapshot.getChildren()) {
        messageList.add(messageShot.getValue(com.codingblocks.groupchat.model.Message.class));
        android.util.Log.e("onDataChange: ", messageList.get(((messageList.size()) - 1)).getMessage());
    }
    listOfMessages = messageList;
    com.codingblocks.groupchat.realm.RealmController.clearAll();
    com.codingblocks.groupchat.realm.RealmController.addToRealm(listOfMessages, this, getGroupID());
}