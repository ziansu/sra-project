@java.lang.Override
public void execute() {
    while ((org.tribot.api2007.Player.getRSPlayer().getInteractingCharacter()) != null) {
        org.tribot.api.General.sleep(500, 800);
        scripts.pestcontrol.antiban.Antiban.doIdleActions();
    } 
    if (this.needToGetDamage())
        scripts.pestcontrol.tasks.DefendKnights.getDamage();
    else
        this.defendKnight();
    
}