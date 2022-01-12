public boolean validSquare(chess.Position next) {
    return (this.valid(next.x)) && (this.valid(next.y));
}