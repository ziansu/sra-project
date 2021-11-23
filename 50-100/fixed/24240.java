public void attack(net.majsokrafo.groundsofthefallen.BoardHalf opponentsSide) {
    for (int i = 0; i < (units.length); i++) {
        for (int j = 0; j < (units[i].length); j++) {
            if ((units[i][j]) != null) {
                units[i][j].attack(this, opponentsSide, i, j);
            }
        }
    }
}