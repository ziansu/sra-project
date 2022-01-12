public void setUnReadMessageCount(int count) {
    if (null == (mUnreadMessageCount)) {
        return ;
    }
    if (count > 0) {
        mUnreadMessageCount.setBackgroundResource(R.drawable.rcs_incall_message_count);
        mUnreadMessageCount.setText(java.lang.String.valueOf(count));
    }else {
        mUnreadMessageCount.setBackgroundResource(R.drawable.rcs_incall_message);
        mUnreadMessageCount.setText("");
    }
}