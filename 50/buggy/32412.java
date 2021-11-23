@org.junit.Test
public void findPath() throws java.lang.Exception {
    rrt.findPath(maze);
    rrt.printGraph();
    rrt.printPath();
}