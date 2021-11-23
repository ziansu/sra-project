public void add_move(java.lang.String san, java.lang.String fen_after) {
    if ((game_ptr) < (move_ptr)) {
        move_ptr = game_ptr;
    }
    if ((move_ptr) >= (MAX_MOVES)) {
    }else {
        positions[move_ptr] = fen_after;
        moves[((move_ptr)++)] = san;
        (game_ptr)++;
    }
    update_game();
}