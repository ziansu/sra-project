@java.lang.Override
public void generateMaze(java.lang.String name, int floors, int rows, int cols, algorithms.mazeGenerators.CommonMaze3dGenerator generator) {
    model.MyModel.generateMazeRunnable generateMaze = new model.MyModel.generateMazeRunnable(floors, rows, cols, name, generator);
    generateMazeTasks.add(generateMaze);
    threadPool.submit(generateMaze);
}