private void setupMessageText(android.view.View view) {
    message = ((android.widget.TextView) (view.findViewById(R.id.message)));
    if ((profile) != null)
        message.setText(("Currently logged in as " + (profile.getName())));
    else
        message.setText(io.github.getExposure.profile.LoginFragment.LOGGED_OUT_TEXT);
    
}