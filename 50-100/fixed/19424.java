@java.lang.Override
public boolean execute() {
    if ((org.tribot.api2007.Player.getPosition().distanceTo(APOTHECARY_TILE)) > (DISTANCE_THRESHOLD))
        scripts.fc.api.travel.Travel.webWalkTo(APOTHECARY_TILE);
    else
        return new scripts.fc.api.interaction.impl.npcs.dialogue.NpcDialogue("Talk-to", "Apothecary", 10, 2, 0).execute();
    
    return false;
}