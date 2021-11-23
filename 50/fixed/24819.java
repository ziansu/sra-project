public void hide() {
    if (shown) {
        shown = false;
        setVisibility(View.GONE);
        plane.waiting.push(this);
    }
}