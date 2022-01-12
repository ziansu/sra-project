@org.junit.Test
public void test_move_piece_updates_piece_and_board() {
    com.ciaran.upskill.chessgame.domain.BoardCell finish = new com.ciaran.upskill.chessgame.domain.BoardCell(2, 3);
    try {
        chessPiece.move(chessBoard, finish);
    } catch (com.ciaran.upskill.chessgame.exceptions.IllegalMoveException e) {
        e.printStackTrace();
    }
    org.hamcrest.MatcherAssert.assertThat(chessBoard.getPieceByLocation(finish).equals(chessPiece), org.hamcrest.core.Is.is(false));
    org.hamcrest.MatcherAssert.assertThat(chessBoard.getPieceByLocation(new com.ciaran.upskill.chessgame.domain.BoardCell(1, 4)), org.hamcrest.core.Is.is(org.hamcrest.CoreMatchers.equalTo(null)));
}