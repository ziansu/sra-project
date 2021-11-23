public void setStage(com.badlogic.gdx.scenes.scene2d.Stage stage) {
    if (((stageGetter) != null) && ((stageGetter.stage) == stage))
        return ;
    
    this.stage = stage;
    stageGetter = new com.ayocrazy.easystage.rmi.StageGetter(stage);
    stageSetter = new com.ayocrazy.easystage.rmi.StageSetter(stageGetter);
}