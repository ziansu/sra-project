private void displayMapCSpace() {
    java.util.ArrayList<MotionPlanning.PolygonObstacle> obstacles = obsCSpaces.get(cspaceIndex);
    for (MotionPlanning.PolygonObstacle obstacle : obstacles) {
        polyMsg = new MotionPlanning.GUIPolyMsg();
        MotionPlanning.CSpaceTest.fillPolyMsg(polyMsg, obstacle, lightBlue, false, true);
        guiPolyPub.publish(polyMsg);
    }
    java.lang.System.out.println(obsCSpaces.size());
    java.lang.System.out.println("Done running displayMapCSpace");
}