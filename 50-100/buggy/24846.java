@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e == null) {
        c.setStatus(Conversation.STATUS_SENT);
    }else {
        android.util.Log.d(com.social.messapp34.ChatActivity.TAG, e.getMessage());
        c.setStatus(Conversation.STATUS_FAILED);
        chatAdapter.notifyDataSetChanged();
    }
}