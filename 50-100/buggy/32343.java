public void openCell(android.widget.ImageView view, int coordinate) {
    if ((!(mapOpenCell[coordinate])) && (!(isFlag(coordinate)))) {
        mapOpenCell[coordinate] = true;
        addPoints();
        setImage(view, coordinate);
    }
}