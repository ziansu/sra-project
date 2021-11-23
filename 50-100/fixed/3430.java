private void reveal() {
    for (controller.GraphicsController control : GraphicsController.games) {
        for (int i = 0; i < (control.size()); i++) {
            if (control.checkMine(i)) {
                control.grid.get(i).setVisible(false);
            }
        }
    }
}