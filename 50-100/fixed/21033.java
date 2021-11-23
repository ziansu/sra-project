@java.lang.Override
public void update() {
    int escRad = crystalModel.getEscapeCircleRadius();
    crystalView.updateImage((((crystalModel.getX()) + escRad) + 4), (((crystalModel.getY()) + escRad) + 4));
}