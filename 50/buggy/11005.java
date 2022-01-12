public boolean doChildrenHaveActions() {
    for (com.gmail.enzocampanella98.candidatecrush.board.Block[] row : blocks) {
        for (com.gmail.enzocampanella98.candidatecrush.board.Block b : row) {
            if (b.isPerformingAction())
                return true;
            
        }
    }
    return false;
}