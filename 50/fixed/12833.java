private boolean shouldRecreateMainActivity() {
    return ((getIntent().getAction()) == null) || (getIntent().getAction().equals(Intent.ACTION_VIEW));
}