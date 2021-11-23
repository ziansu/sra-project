public void rotate(int direction) {
    if ((java.lang.Math.abs(direction)) != 1) {
        java.lang.System.out.println("ERROR: bad argument: direction in Character.rotate()");
        return ;
    }
    facing = (((facing) + 4) + direction) % 4;
}