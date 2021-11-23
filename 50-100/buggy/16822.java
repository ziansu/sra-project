public void setSize(int size) {
    if ((size > 2) && ((size % 2) == 1)) {
        this.size = size;
    }else {
        java.lang.System.out.println(("You can't assign the size to " + size));
        java.lang.System.out.println("Size of the maze have to be odd and more than 2");
        java.lang.System.out.println(("The size of the maze will be " + (main.Maze.defaultSize)));
        this.size = main.Maze.defaultSize;
    }
}