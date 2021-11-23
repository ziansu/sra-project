private void MoveRight() {
    int ix = mProperty.x;
    int iy = mProperty.y;
    if (!(isEdge(ix, iy, CRobot.EAST))) {
        ix++;
    }
    Place(ix, iy, CRobot.EAST);
}