@java.lang.Override
public boolean activate() {
    return (Lumbridge.HamBarracks.area.contains(ctx.players.local())) && ((((org.booleanfloat.treasuretrailer.main.Resources.isStunned) || (org.booleanfloat.treasuretrailer.main.Resources.isDropping)) || ((ctx.inventory.select().count()) == 28)) || ((org.booleanfloat.treasuretrailer.main.Resources.hasClue) && ((ctx.inventory.select().id(Resources.HAM_JUNK_IDS).count()) >= 1)));
}