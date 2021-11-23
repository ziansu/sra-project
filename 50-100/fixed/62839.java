public void setFilledBoard(int x, int y, int width, int height) {
    if ((x == (-1)) && (y == (-1))) {
        this.location = null;
    }else {
        this.location = new client.model.Location(0, 0);
        this.location.setPanelLocation(x, y, width, height);
    }
}