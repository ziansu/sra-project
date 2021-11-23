public void turnRight() {
    if (rover.getDirection().equals("N")) {
        rover.setDirection("E");
    }
    if (rover.getDirection().equals("E")) {
        rover.setDirection("S");
    }
    if (rover.getDirection().equals("S")) {
        rover.setDirection("W");
    }
    if (rover.getDirection().equals("W")) {
        rover.setDirection("N");
    }
}