public boolean teleport(Board board, int endX, int endY) {
    if (board.isMoveable(endX, endY)) {
        board.MovePiece(this.x, this.y, endX, endY);
        return true;
    }else {
        java.lang.System.out.println("Can't teleport");
        return false;
    }
}