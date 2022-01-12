public void end(java.lang.Character character) {
    for (com.dungeon.game.effect.Effect effect : character.effects) {
        if ((effect instanceof com.dungeon.game.effect.Immune) && (!(effect.equals(this))))
            return ;
        
    }
    character.immune = false;
}