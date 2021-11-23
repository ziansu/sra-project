public void setPass() {
    if (((phase) != (com.trifice.theunderworldsiege.Phase.ACTIVE)) && ((phase) != (com.trifice.theunderworldsiege.Phase.PASSIVE)))
        return ;
    
    if (!(currentPlayers.contains(this.myPlayer)))
        return ;
    
    selectedCards.clear();
    selectedCards.add(com.trifice.theunderworldsiege.MainModel.passCard);
    confirm = 0;
}