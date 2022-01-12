private static net.visualillusionsent.crafters.against.blocks.user.HumanUser getCzar() {
    if ((((net.visualillusionsent.crafters.against.blocks.play.Table.inProgress) != null) && (net.visualillusionsent.crafters.against.blocks.play.Table.inProgress.roundStarted())) && (!(net.visualillusionsent.crafters.against.blocks.play.Table.inProgress.roundEnded()))) {
        throw new java.lang.IllegalStateException("Getting the Card Czar during a round is progress is outside manipulations.");
    }
    if ((net.visualillusionsent.crafters.against.blocks.play.Table.czarindex) > (net.visualillusionsent.crafters.against.blocks.play.Table.players.size())) {
        net.visualillusionsent.crafters.against.blocks.play.Table.czarindex = 0;
    }
    return new java.util.ArrayList<net.visualillusionsent.crafters.against.blocks.user.HumanUser>(net.visualillusionsent.crafters.against.blocks.play.Table.players.values()).get(((net.visualillusionsent.crafters.against.blocks.play.Table.czarindex)++));
}