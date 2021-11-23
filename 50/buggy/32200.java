@java.lang.Override
public boolean undo() {
    if (!(valid()))
        return false;
    
    level.getBoard().addHexomino(new java.awt.Point(srcAnchorRow, srcAnchorColumn), hex);
    return true;
}