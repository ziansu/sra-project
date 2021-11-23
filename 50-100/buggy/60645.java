@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode != (RESULT_CANCELED)) {
        switch (requestCode) {
            default :
                android.os.Bundle bundle = getIntent().getExtras();
                hero = bundler.unbundleHero(bundle);
        }
    }
}