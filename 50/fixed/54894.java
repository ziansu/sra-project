public void update() {
    if (started) {
        for (view.Drawable.DrawableTrain t : trains) {
            onSectionCheck(t);
            t.update();
        }
    }
}