@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    java.lang.String receiverFCMToken = dataSnapshot.getValue(java.lang.String.class);
    if ((receiverFCMToken != null) && (!(receiverFCMToken.equals("")))) {
        com.example.rajk.leasingmanagers.model.Notif newNotif = new com.example.rajk.leasingmanagers.model.Notif(id, timestamp, type, senderId, receiverId, receiverFCMToken, content, taskId);
        com.example.rajk.leasingmanagers.LeasingManagers.notif.child(receiverId).child(id).setValue(newNotif);
    }
}