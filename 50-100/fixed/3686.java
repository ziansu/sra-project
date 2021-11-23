@java.lang.Override
public void solveMaze3d(java.lang.String name, algorithms.search.CommonSearcher<algorithms.mazeGenerators.Position> searcher) {
    java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            algorithms.mazeGenerators.Maze3d maze = mazeMap.get(name);
            algorithms.search.Searchable<algorithms.mazeGenerators.Position> searchableMaze = new algorithm.demo.MazeAdapter(maze);
            algorithms.search.Solution<algorithms.mazeGenerators.Position> solution = searcher.search(searchableMaze);
            solutionMap.put(name, solution);
            controller.notifySolutionIsReady(name);
        }
    });
    threadPool.submit(thread);
}