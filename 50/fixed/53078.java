public void onBackPressed() {
    if (!(((menuExpander) != null) && (menuExpander.handleBackPressed()))) {
        super.onBackPressed();
    }
}