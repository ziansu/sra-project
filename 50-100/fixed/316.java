public poker.Pot getSidePot(int amount, players.Player player) {
    poker.Pot sidePot = new poker.Pot(((bet) - amount));
    this.bet = amount;
    for (players.Player member : members) {
        sidePot.addMember(member);
    }
    members.add(player);
    return sidePot;
}