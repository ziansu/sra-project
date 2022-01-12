private void register(com.xfrocks.api.androiddemo.Api.User u) {
    android.content.Intent registerIntent = new android.content.Intent(this, com.xfrocks.api.androiddemo.RegisterActivity.class);
    if (u != null) {
        registerIntent.putExtra(RegisterActivity.EXTRA_USER, u);
    }
    startActivityForResult(registerIntent, com.xfrocks.api.androiddemo.LoginActivity.RC_REGISTER);
}