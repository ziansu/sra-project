public boolean isPossibleToPlay(fr.iutvalence.montcarmeljourdan.reversi.Color c) {
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            if ((processAllLines(i, j, c)) > 0) {
                return true;
            }
        }
    }
    return false;
}