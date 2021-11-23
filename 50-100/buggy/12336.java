model.Position winningMove(common.boardclass.BoardClass<common.pattern.Threat> boardClass, common.StoneType attacker, int depth) {
    for (int i = 0; i <= depth; i++) {
        model.Position position = offend(boardClass, attacker, new java.util.HashMap<>(), depth);
        if (position != null) {
            return position;
        }
    }
    return null;
}