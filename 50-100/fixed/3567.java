public void initDirection(com.ru.tgra.shapes.Maze maze) {
    int i = rand.nextInt(4);
    while (!(getOpen(i, maze))) {
        i = (i + 1) % 4;
    } 
    direction = i;
    destination = destination(i, maze);
    moving = true;
}