private void setupMessageText(android.view.View view) {
    message = ((android.widget.TextView) (view.findViewById(R.id.message)));
    if ((profile) != null) {
        java.lang.String text = "Currently logged in as " + (profile.getName());
        message.setText(text);
    }else {
        message.setText(io.github.getExposure.profile.LoginFragment.LOGGED_OUT_TEXT);
    }
}