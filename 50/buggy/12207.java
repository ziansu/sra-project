public se.liu.ida.erihe763.tddd78.tetris.Poly spawnPoly() {
    se.liu.ida.erihe763.tddd78.tetris.TetrominoMaker tetrominoMaker = new se.liu.ida.erihe763.tddd78.tetris.TetrominoMaker();
    return tetrominoMaker.getPoly(new java.util.Random().nextInt(tetrominoMaker.getNumberOfTypes()));
}