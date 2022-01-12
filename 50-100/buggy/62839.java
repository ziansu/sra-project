public void setFilledBoard(int x, int y, int width, int height) {
    if ((width != 0) && (height != 0)) {
        this.location = new client.model.Location(0, 0);
        this.location.setPanelLocation(x, y, width, height);
    }else
        this.location = null;
    
}