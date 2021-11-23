@java.lang.Override
public void run() {
    if ((i) == (solution.getSolution().size())) {
        cancel();
        return ;
    }
    if ((i) == (-1)) {
        i = 0;
    }
    character.setPos(solution.getSolution().get(((i)++)).getState());
    setMazeData(maze.getCrossSectionByZ(character.getPos().z));
    redraw();
}