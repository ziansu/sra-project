@java.lang.Override
protected void onPostExecute(final retrofit.Response<edu.boun.cmpe451.group2.android.api.User> response) {
    user = response.body();
    android.widget.TextView nav_userNameView = ((android.widget.TextView) (findViewById(R.id.nav_view_userName)));
    android.widget.TextView nav_userEmailView = ((android.widget.TextView) (findViewById(R.id.nav_view_emailName)));
    if ((user) != null) {
        nav_userNameView.setText(user.full_name);
        nav_userEmailView.setText(user.getEmail());
    }
}