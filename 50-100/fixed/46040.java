@org.junit.Test
public void canGetAllAvailablePositions() {
    Board board = new Board("---x-----");
    java.util.ArrayList<java.lang.Integer> positions = board.availablePositions();
    for (int i = 0; i < (positions.size()); i++) {
        int position = positions.get(i);
        org.junit.Assert.assertThat(board.availablePosition((position - 1)), org.hamcrest.core.Is.is(true));
    }
}