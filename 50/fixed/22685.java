public three_point_one.parser.TableCell getTableCellAt(three_point_one.parser.Symbol symbol, int state_id) {
    return table.get((state_id - 1)).get(symbol);
}