public static boolean isExact(org.akoshterek.backgammon.board.PositionClass pc) {
    return (pc == (org.akoshterek.backgammon.board.PositionClass.CLASS_OVER)) || (org.akoshterek.backgammon.board.PositionClass.isBearoff(pc));
}