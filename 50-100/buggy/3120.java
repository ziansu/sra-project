public void addOrUpdatePosition(final org.scenarioo.example.e4.domain.Position pos) {
    int index = positions.indexOf(pos);
    if (index == (-1)) {
        positions.add(pos);
    }else {
        positions.add(index, pos);
    }
}