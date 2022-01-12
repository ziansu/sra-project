private void getBundle() {
    android.os.Bundle bundle = getIntent().getExtras();
    if ((null != bundle) && (!(bundle.isEmpty()))) {
        id = bundle.getInt("id");
    }
}