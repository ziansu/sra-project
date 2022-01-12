public int boardEvaluation(player.Board board) {
    if (board.success(machineColor)) {
        return MACHINE_WIN;
    }else
        if (board.success(humanColor)) {
            return HUMAN_WIN;
        }else {
            return (board.connectedChipsNum(machineColor)) - (board.connectedChipsNum(humanColor));
        }
    
}