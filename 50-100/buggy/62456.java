@java.lang.Override
public void reset() {
    if ((controller.STATE.equals(qmaze.View.MazeComponents.RESET_STATE)) || (controller.STATE.equals(qmaze.View.MazeComponents.ADJUST_PARAM_STATE))) {
        initialiseMazeRooms();
        setAgentLocation(null);
    }
    if (controller.STATE.equals(qmaze.View.MazeComponents.TRAINED_STATE)) {
        java.util.HashMap heatMap = controller.getHeatMap();
        showVisitCount(heatMap);
    }
    if (controller.STATE.equals(qmaze.View.MazeComponents.ADJUST_MAZE_STATE)) {
        setAgentLocation(null);
        showVisitCount(new java.util.HashMap());
    }
    redrawMaze();
}