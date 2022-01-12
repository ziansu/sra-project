public capstat.model.User calculateStartingPlayer() {
    capstat.model.User user = this.player1;
    capstat.model.ChalmersAge age1 = this.player1.getChalmersAge();
    capstat.model.ChalmersAge age2 = this.player2.getChalmersAge();
    int comparison = age1.compareTo(age2);
    if (comparison < 0)
        user = this.player2;
    
    return new capstat.model.User(user);
}