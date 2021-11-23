public void update() {
    if (started) {
        for (view.Drawable.DrawableTrain t : trains) {
            java.lang.System.out.println("Updating");
            onSectionCheck(t);
            t.update();
        }
    }
}