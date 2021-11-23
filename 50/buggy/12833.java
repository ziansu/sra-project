private boolean shouldRecreateMainActivity() {
    return getIntent().getAction().equals(Intent.ACTION_VIEW);
}