public int reflectDirection(int laser_direction) {
    laser_direction = jkhet.Piece.mod((laser_direction + 2), 4);
    int relative_side = jkhet.Piece.mod((laser_direction - (rot)), 4);
    if (relative_side == 0) {
        return jkhet.Piece.mod((1 + (rot)), 4);
    }else
        if (relative_side == 1) {
            return jkhet.Piece.mod(rot, 4);
        }else {
            board_pieces.remove(this);
            return -1;
        }
    
}