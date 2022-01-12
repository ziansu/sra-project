double selectfn(org.ggp.base.player.gamer.statemachine.Mikes_angels.node curr, java.lang.Boolean onePlayer) {
    int coefficient = (onePlayer) ? 1 : curr.role ? 1 : -1;
    return ((coefficient * (curr.utility)) / (curr.visited)) + (java.lang.Math.sqrt(((2 * (java.lang.Math.log(curr.parent.visited))) / (curr.visited))));
}