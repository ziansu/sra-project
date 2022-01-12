private void initInventory(ferdi.david.tim.pme16_crafting_game.DBUser user) {
    if (user != null) {
        for (ferdi.david.tim.pme16_crafting_game.EResourceType resource : ferdi.david.tim.pme16_crafting_game.EResourceType.values()) {
            if (resource != (EResourceType.NONE)) {
                ferdi.david.tim.pme16_crafting_game.DBResource newResource = new ferdi.david.tim.pme16_crafting_game.DBResource(resource, this.app.getUser());
                newResource.save();
            }
        }
    }
}