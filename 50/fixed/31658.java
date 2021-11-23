public void setPosition(double x, double y) {
    this.x = (x * (moveScale)) % (main.GamePanel.WIDTH);
    this.y = 0;
}