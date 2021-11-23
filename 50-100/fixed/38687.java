public void updateBricks() {
    for (int i = 0; i < (this.model.getBrickRowCount()); i++) {
        for (int j = 0; j < (this.model.getBrickColumnCount()); j++) {
            program.practicum.breakout.Bricks b = bricks[i][j];
            if ((this.model.bricks[i][j]) == true) {
                add(b);
            }
        }
    }
}