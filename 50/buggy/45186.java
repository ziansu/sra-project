@java.lang.Override
public void update() {
    super.update();
    this.manageInput();
    if (this.game.isInCutscene)
        this.ai.update();
    
    this.game.getMap().lightManager.update();
}