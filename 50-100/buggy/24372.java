public dnd.core.FightModule fight() {
    dnd.core.FightModule fightModule = null;
    if ((this.getContentType()) == (dnd.tools.various.ContentType.Monster)) {
        java.lang.Character monster = ((java.lang.Character) (this.getCurrentRoom().getContent()));
        fightModule = new dnd.core.FightModuleImpl(this.player, monster);
    }else {
        throw new java.lang.IllegalArgumentException("Content of room is no monster, can't fight");
    }
    return fightModule;
}