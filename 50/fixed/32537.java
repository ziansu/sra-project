@java.lang.Override
public void onPathReady(int cellIndex, java.awt.Point first, java.awt.Point second) {
    if ((pathfindingSystem) == null) {
        assert false;
    }
    pathfindingSystem.getPath(0, first, 0, second);
}