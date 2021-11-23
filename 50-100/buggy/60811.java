public void addPlay(net.visualillusionsent.crafters.against.blocks.user.User user, net.visualillusionsent.crafters.against.blocks.cards.WhiteCard... cards) {
    if (((state) == (net.visualillusionsent.crafters.against.blocks.play.Round.State.STARTED)) && (isInRound(user))) {
        played.put(user, cards);
        if ((played.size()) == ((players.size()) + (isRandoPlaying()))) {
            showCards();
        }
    }
}