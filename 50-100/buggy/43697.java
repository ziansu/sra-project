private void loadStartFragment() {
    android.content.Intent intent = getIntent();
    com.example.bbschool.bbremotemobile.Mode mode = Mode.Keyboard;
    if (intent.hasExtra("Mode")) {
        mode = ((com.example.bbschool.bbremotemobile.Mode) (intent.getSerializableExtra("Mode")));
    }
    swapFragments(mode);
}