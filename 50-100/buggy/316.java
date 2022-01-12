public poker.Pot getSidePot(int amount, players.Player player) {
    members.add(player);
    poker.Pot sidePot = new poker.Pot(((bet) - amount));
    this.bet = amount;
    for (players.Player member : members) {
        sidePot.addMember(member);
    }
    return sidePot;
}