public void kill(java.lang.String[] type, shared.logic.Player killer) {
    if (killWillSucceed(type, killer)) {
        (lives)--;
        attackTypeList.add(type);
    }
    if (shouldGetImmuneFeedback(type))
        new shared.event.Feedback(this, shared.logic.support.Constants.NIGHT_IMMUNE_TARGET_FEEDBACK);
    
}