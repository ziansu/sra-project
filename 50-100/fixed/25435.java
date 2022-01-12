@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == null)
        return false;
    
    if ((this.getClass()) != (obj.getClass()))
        return false;
    
    com.model.player.Player newPlayer = ((com.model.player.Player) (obj));
    return (this.name.equals(newPlayer.getName())) || ((this.getSymbol()) == (newPlayer.getSymbol()));
}