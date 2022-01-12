public void draw(java.awt.Graphics g) {
    if (!(fruit.isEaten())) {
        g.setColor(fruit.getColor());
        g.fillRect(fruitDisplay.x, fruitDisplay.y, fruitDisplay.width, fruitDisplay.height);
    }
}