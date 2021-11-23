void appendSquare(entities.Square s) {
    squares.add(s);
    if (!(squares.isEmpty())) {
        letters.concat(s.tilePeek().toString());
    }
}