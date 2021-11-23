public void moveRight() {
    if ((xPos) < ((world.getMap().get(yPos).size()) - 1)) {
        (xPos)++;
        current = world.getTile(yPos, xPos);
        status = current.getType();
        java.lang.System.out.println((((xPos) + ", ") + (yPos)));
    }else {
        java.lang.System.out.println("Can't move, edge");
        status = "You can't move in that direction.";
    }
}