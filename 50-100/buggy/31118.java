private boolean isInRange(csci4020.shawnbickel_judsonthomas.final_project.bickel_thomas_tetris.TetrisGameEngine.Position position) {
    if (((((position.x) < 0) || ((position.x) > (numCols))) || ((position.y) < 0)) || ((position.y) > (numRows))) {
        return false;
    }
    return true;
}