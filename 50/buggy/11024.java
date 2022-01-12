public void moveUp(int maxCoordinateY) {
    if ((currentCoordinateY) != maxCoordinateY) {
        (currentCoordinateY)++;
    }else {
        java.lang.System.out.println("you bumped into a wall.");
    }
}