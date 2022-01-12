public boolean action(model.Avatar avatar) {
    if ((actionDone) == false) {
        int currentXP = avatar.getStatValue("Experience");
        avatar.setStatValue("Experience", (currentXP + (reward)));
        actionDone = true;
        changeState();
        return true;
    }
    changeState();
    return false;
}