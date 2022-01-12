private csci4020.shawnbickel_judsonthomas.final_project.bickel_thomas_tetris.TetrisGameEngine.Position rotateVector(csci4020.shawnbickel_judsonthomas.final_project.bickel_thomas_tetris.TetrisGameEngine.Rotation rotation) {
    if (rotation == (csci4020.shawnbickel_judsonthomas.final_project.bickel_thomas_tetris.TetrisGameEngine.Rotation.CCW_90)) {
        return new csci4020.shawnbickel_judsonthomas.final_project.bickel_thomas_tetris.TetrisGameEngine.Position(this.y, (-(this.x)));
    }else
        if (rotation == (csci4020.shawnbickel_judsonthomas.final_project.bickel_thomas_tetris.TetrisGameEngine.Rotation.CW_90)) {
            return new csci4020.shawnbickel_judsonthomas.final_project.bickel_thomas_tetris.TetrisGameEngine.Position((-(this.y)), this.x);
        }else {
            return null;
        }
    
}