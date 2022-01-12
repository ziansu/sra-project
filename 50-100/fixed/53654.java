private void setUserNameMailView() {
    android.widget.TextView textViewName = ((android.widget.TextView) (findViewById(R.id.user_name_header)));
    android.widget.TextView textViewMail = ((android.widget.TextView) (findViewById(R.id.user_mail_header)));
    textViewName.setText(currentRegisteredUser.getDisplayName());
    textViewMail.setText(currentRegisteredUser.getEmail());
}