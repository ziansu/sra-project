@java.lang.Override
public nl.dke.boardgame.mcts.MonteCarloNode<S, A> choose(nl.dke.boardgame.mcts.MonteCarloRootNode<S, A> root) {
    nl.dke.boardgame.mcts.MonteCarloNode<S, A> node = root;
    while (!(node.getState().isTerminal())) {
        if (!(node.isFullyExpanded())) {
            return expand(node);
        }else {
            node = bestChild(node);
        }
    } 
    return node;
}