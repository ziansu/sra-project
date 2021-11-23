public void setY(int y) {
    if (editing)
        comp.getPosition().setLocation(getX(), y);
    
    this.y = y;
}