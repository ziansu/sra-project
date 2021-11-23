public boolean removePiece(int ID) {
    for (int i = 0; i < (this.pieces.size()); i++) {
        if ((this.pieces.get(i).getId()) == ID) {
            originalPieces.add(this.pieces.remove(i));
            return true;
        }
    }
    return false;
}