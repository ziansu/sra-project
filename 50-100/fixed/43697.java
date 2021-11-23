private void loadStartFragment() {
    mode = Mode.Keyboard;
    android.content.Intent intent = getIntent();
    if (intent.hasExtra("Mode")) {
        mode = ((com.example.bbschool.bbremotemobile.Mode) (intent.getSerializableExtra("Mode")));
    }
    swapFragments(mode);
}