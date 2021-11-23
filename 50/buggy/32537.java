@java.lang.Override
public void onPathReady(int cellIndex, java.awt.Point first, java.awt.Point second) {
    pathfindingSystem.getPath(0, first, 0, second);
}