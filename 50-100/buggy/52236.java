public void copyTo(core.VGDLSprite target) {
    ontology.avatar.MovingAvatar targetSprite = ((ontology.avatar.MovingAvatar) (target));
    targetSprite.alternate_keys = this.alternate_keys;
    targetSprite.actions = new java.util.ArrayList<ontology.Types.ACTIONS>();
    targetSprite.actionsNIL = new java.util.ArrayList<ontology.Types.ACTIONS>();
    targetSprite.lastAction = this.lastAction;
    targetSprite.postProcess();
    super.copyTo(targetSprite);
}