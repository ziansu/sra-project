private void init() {
    inflate(getContext(), R.layout.com_auth0_lock_action_button, this);
    progress = ((android.widget.ProgressBar) (findViewById(R.id.com_auth0_lock_progress)));
    progress.setVisibility(View.GONE);
    icon = ((android.widget.ImageView) (findViewById(R.id.com_auth0_lock_icon)));
    android.util.TypedValue outValue = new android.util.TypedValue();
    getContext().getTheme().resolveAttribute(R.attr.Auth0_PrimaryColor, outValue, true);
    setBackgroundResource(outValue.resourceId);
}