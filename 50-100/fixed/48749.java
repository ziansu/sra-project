public void recallActor(com.badlogic.gdx.scenes.scene2d.Actor a) {
    int x = java.lang.Math.round((((a.getX()) - (getX())) / (cellWidth)));
    int y = ((gridHeight) - (java.lang.Math.round((((a.getY()) - (getY())) / (cellHeight))))) - 1;
    contents[x][y] = a.getName();
    (animationCount)--;
    removeActor(a);
}