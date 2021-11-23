public void removeToken(int row, int col) throws InvalidCoordinatesException {
    BoardNode node = findNode(row, col);
    Token emptyToken = node.getToken();
    emptyToken.setSide(Side.NONE);
    java.util.List<Mill> millList = findMills(emptyToken);
    for (Mill m : millList) {
        m.placeToken(emptyToken);
    }
}