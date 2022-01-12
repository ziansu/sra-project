@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.i("lgh", ("onAcceptButton: " + (user.toString())));
    android.widget.Button bt = ((android.widget.Button) (v));
    bt.setText(mContext.getString(R.string.added));
    bt.setClickable(false);
    bt.setBackgroundResource(R.drawable.selector_gray_background);
    user.setType(UserDAO.FRIENDS);
    mUserDAO.update(user);
    initConversation(user.getUsername());
}