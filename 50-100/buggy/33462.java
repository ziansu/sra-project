public void placeShipImage(int x, int y) {
    int gridPixelWidth = com.example.simon.battleships.GameManager.getGridPixelWidth();
    int gridX = x / gridPixelWidth;
    int gridY = y / gridPixelWidth;
    com.example.simon.battleships.GameManager.placeShip(gridX, gridY);
    imageView.setX((gridX * gridPixelWidth));
    imageView.setY((gridY * gridPixelWidth));
    imageView.setVisibility(View.VISIBLE);
}