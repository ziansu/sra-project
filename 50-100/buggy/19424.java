@java.lang.Override
public boolean execute() {
    if ((org.tribot.api2007.Player.getPosition().distanceTo(APOTHECARY_TILE)) > (DISTANCE_THRESHOLD))
        scripts.fc.api.travel.Travel.webWalkTo(APOTHECARY_TILE);
    else {
        if ((new scripts.fc.api.interaction.impl.npcs.dialogue.NpcDialogue("Talk-to", "Apothecary", 10, 2, 0).execute()) && (QuestSettings.APOTHECARY_DIALOGUE_TWO.isValid()))
            if (org.tribot.api.Timing.waitCondition(FCConditions.CLICK_CONTINUE_CONDITION, 6000))
                if (org.tribot.api2007.NPCChat.clickContinue(true))
                    org.tribot.api.General.sleep(800, 1800);
                
            
        
    }
    return false;
}