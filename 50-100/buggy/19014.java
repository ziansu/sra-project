public void draw(java.awt.Graphics g) {
    if (!(fruit.isEaten())) {
        g.setColor(fruit.getColor());
        g.fillRect(fruit.getFruitX(), fruit.getFruitY(), fruitDisplay.width, fruitDisplay.height);
    }
}