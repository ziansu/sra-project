private void MoveLeft() {
    int ix = mProperty.x;
    int iy = mProperty.y;
    if (!(isEdge(ix, iy, CRobot.WEST))) {
        ix--;
    }
    Place(ix, iy, CRobot.WEST);
}