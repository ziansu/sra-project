public void onClick(android.content.DialogInterface dialog, int whichButton) {
    client.smrtms.com.smrtms_client.controller.JSONReader<client.smrtms.com.smrtms_client.tokens.FriendReqToken> reader = new client.smrtms.com.smrtms_client.controller.JSONReader();
    java.lang.String friendReq = reader.JSONWriter(pendingFriendReq.pop());
    client.smrtms.com.smrtms_client.controller.Client.getInstance().WriteMsg(friendReq);
    notificationManager.cancel(1000);
}