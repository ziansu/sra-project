public void returnToWorkspaceOrigin() {
    com.example.iuas.RobotControl.control("turn", 180);
    com.example.iuas.RobotControl.control("drive", 20);
    setBall(false);
    moveToEgocentricPoint(Vector2.NULL);
}