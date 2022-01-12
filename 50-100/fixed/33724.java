public int columnHeight(int y) {
    int count = 0;
    int tmp_x = (game.Board.board_x) - 1;
    while (((this.whoControls(tmp_x, y)) != (Field.control.NONE)) && (tmp_x >= 0)) {
        tmp_x--;
        count++;
    } 
    return count;
}