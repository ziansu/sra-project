public void die() {
    data.incrementObservableValue(observableDataKey, 1);
    this.getPosition().x = respawnPosition.x;
    this.getPosition().y = respawnPosition.y;
    nidhogglike.entities.Sword sword = ((nidhogglike.game.NidhoggUniverse) (data.getUniverse())).getFreeSword();
    if (sword != null)
        setSword(sword);
    
}