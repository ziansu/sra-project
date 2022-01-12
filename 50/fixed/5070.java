private void update() {
    for (com.dean.getracker.model.geModel model : models) {
        model.update(position, width);
    }
}