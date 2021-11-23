public void move(int direction) {
    position += direction * (month);
    for (com.dean.getracker.model.geModel model : models) {
        model.update(position, width);
    }
}