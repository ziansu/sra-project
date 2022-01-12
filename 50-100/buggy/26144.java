private void setUserNameMailView() {
    com.journee.model.User user = dbLink.selectUser(mEmail);
    android.widget.TextView textViewName = ((android.widget.TextView) (findViewById(R.id.user_name_header)));
    android.widget.TextView textViewMail = ((android.widget.TextView) (findViewById(R.id.user_mail_header)));
    textViewName.setText(user.getDisplayName());
    textViewMail.setText(this.mEmail);
}