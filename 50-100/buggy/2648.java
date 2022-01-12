public void done(java.util.List<com.example.cmput401.classdiscuss.Message> messages, com.parse.ParseException e) {
    if (e == null) {
        if ((mMessages) != null) {
            mMessages.clear();
            mMessages.addAll(messages);
        }
        mAdapter.notifyDataSetChanged();
        lvChat.invalidate();
    }else {
        android.util.Log.d("message", ("Error: " + (e.getMessage())));
    }
}