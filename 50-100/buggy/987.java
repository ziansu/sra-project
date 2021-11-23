public void moveDown() {
    if ((yPos) < (world.getMap().size())) {
        (yPos)++;
        current = world.getTile(yPos, xPos);
        status = current.getType();
        java.lang.System.out.println((((xPos) + ", ") + (yPos)));
    }else {
        java.lang.System.out.println("Can't move, edge");
        status = "You can't move in that direction.";
    }
}