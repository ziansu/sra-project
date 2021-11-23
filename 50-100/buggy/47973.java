private void addListeners() {
    crystalModel.setUpdateListener(() -> {
        int escRad = crystalModel.getEscapeCircleRadius();
        crystalView.updateImage((((crystalModel.getX()) + escRad) + 4), ((escRad - (crystalModel.getY())) + 4));
    });
}