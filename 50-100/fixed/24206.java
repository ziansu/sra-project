@java.lang.Override
public void onResult(boolean confirmed, android.os.Bundle bundle) {
    if (confirmed) {
        if ((selectUser) == null)
            return ;
        
        try {
            ChatActivity.activityInstance.finish();
        } catch (java.lang.Exception e) {
        }
        android.content.Intent intent = new android.content.Intent(this, com.easemob.chatuidemo.ui.ChatActivity.class);
        intent.putExtra("userId", selectUser.getUsername());
        intent.putExtra("forward_msg_id", forward_msg_id);
        startActivity(intent);
        finish();
    }
}