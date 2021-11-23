public boolean isPositionAvailable(int position) {
    return ((position >= 0) && (position < (cells.length))) && (!(((cells[position]) == (de.rabea.game.Cell.Cell.X)) || ((cells[position]) == (de.rabea.game.Cell.Cell.O))));
}