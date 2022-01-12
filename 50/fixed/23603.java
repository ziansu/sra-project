private void refresh() {
    if (touched) {
        this.finish();
        startActivity(getIntent());
    }
    touched = false;
}