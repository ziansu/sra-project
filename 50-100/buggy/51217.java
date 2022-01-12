public void consume(java.lang.Character user) {
    if ((((item) != null) && ((item) instanceof com.dungeon.game.item.consumable.Consumable)) && (((com.dungeon.game.item.consumable.Consumable) (item)).use(user))) {
        (item.stack)--;
        if ((item.stack) == 0)
            item = null;
        
    }
}