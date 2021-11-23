private void addListeners() {
    crystalModel.setUpdateListener(() -> {
        int escRad = crystalModel.getEscapeCircleRadius();
        crystalView.updateImage((((crystalModel.getX()) + escRad) + 4), (((crystalModel.getY()) + escRad) + 4));
    });
}