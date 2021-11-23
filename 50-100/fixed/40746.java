@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    chat = dataSnapshot.getValue(com.a461group5.utbuysell.Chat.class);
    if ((chat.getMessages()) != null) {
        if (firstTime) {
            for (com.a461group5.utbuysell.Chat.Message m : chat.getMessages()) {
                displayMessage(m);
            }
            firstTime = false;
        }else {
            displayMessage(chat.getLastMessage());
        }
    }
}