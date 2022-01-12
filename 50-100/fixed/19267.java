public void reverse() {
    for (int n = 0; n < ((_players.size()) - 1); n++) {
        _players.add(0, _players.remove((n + 1)));
    }
}