@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    userMessages.add(index, dataSnapshot.getValue(com.serhaturtis.getlocaty.models.MessageItem.class));
    fragmentMyMessages.rcAdapter.notifyDataSetChanged();
}