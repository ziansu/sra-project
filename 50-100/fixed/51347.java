public boolean removePiece(int ID) {
    for (int i = 0; i < (this.pieces.size()); i++) {
        if ((this.pieces.get(i).getId()) == ID) {
            originalPieces.add(this.pieces.remove(i));
            java.lang.System.out.println(pieces.size());
            return true;
        }
    }
    return false;
}