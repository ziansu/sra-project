private boolean checkMoveDiagDR(int Px, int Py, int Dx, int Dy, boolean W, java.util.ArrayList<com.anthony.chessgame.piece.Piece> B) {
    boolean obstacle = false;
    for (int i = 1; i < Dy; i++) {
        if (!(com.anthony.chessgame.util.Utils.isVoid(B, (Px - i), (Py + i))))
            obstacle = true;
        
    }
    return !obstacle;
}