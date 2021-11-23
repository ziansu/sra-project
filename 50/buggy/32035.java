public org.jtrfp.trcl.beh.ui.UserInputWeaponSelectionBehavior setBehaviors(org.jtrfp.trcl.beh.ProjectileFiringBehavior[] behaviors) {
    this.behaviors = behaviors;
    activeBehavior = behaviors[0];
    return this;
}