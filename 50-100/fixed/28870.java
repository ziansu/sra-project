private org.ggp.base.player.gamer.statemachine.Mikes_angels.node makeNode(java.lang.Boolean childrenSeen, org.ggp.base.util.statemachine.MachineState state, int visited, double utility, org.ggp.base.player.gamer.statemachine.Mikes_angels.node parent, java.util.List<org.ggp.base.player.gamer.statemachine.Mikes_angels.node> children, org.ggp.base.util.statemachine.Move move) {
    org.ggp.base.player.gamer.statemachine.Mikes_angels.node result = new org.ggp.base.player.gamer.statemachine.Mikes_angels.node();
    result.allChildrenSeen = childrenSeen;
    result.state = state;
    result.children = children;
    result.visited = visited;
    result.utility = utility;
    result.parent = parent;
    result.move = move;
    return result;
}