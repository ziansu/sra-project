private void moveToClosestTreasure(pirates.game.PirateGame game, pirates.game.Pirate p) {
    if ((availableTreasures.size()) == 0)
        return ;
    
    pirates.game.Treasure nearestTreasure = availableTreasures.get(0);
    for (pirates.game.Treasure t : availableTreasures) {
        if ((game.distance(p, t)) < (game.distance(p, nearestTreasure)))
            nearestTreasure = t;
        
    }
    move(game, p, nearestTreasure.getLocation(), remainingActions);
}