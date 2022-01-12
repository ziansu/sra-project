@java.lang.Override
public void run() {
    if ((i) == (solution.getSolution().size())) {
        cancel();
        return ;
    }
    character.setPos(solution.getSolution().get(((i)++)).getState());
    setMazeData(maze.getCrossSectionByZ(character.getPos().z));
    redraw();
}