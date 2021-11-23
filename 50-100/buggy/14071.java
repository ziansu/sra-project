@java.lang.Override
public void generateMaze(java.lang.String name, int floors, int rows, int cols, algorithms.mazeGenerators.CommonMaze3dGenerator generator) {
    model.MyModel.generateMazeRunnable generateMaze = new model.MyModel.generateMazeRunnable(floors, rows, cols, name, generator);
    generateMazeTasks.add(generateMaze);
    java.lang.Thread thread = new java.lang.Thread(generateMaze);
    thread.start();
    threadPool.submit(generateMaze);
}