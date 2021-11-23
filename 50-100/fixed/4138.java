public void initializeStateTree(OurStateTree root, int d) {
    if (d == 0) {
        return ;
    }else {
        root.genChild();
        for (int i = 0; i < (root.children.size()); i++) {
            if ((Referee.checkForWinner(root.children.get(i).getStateTree())) == 0) {
                initializeStateTree(root.children.get(i), (d - 1));
            }
        }
    }
}