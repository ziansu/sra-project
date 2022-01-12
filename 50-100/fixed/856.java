public void Process() {
    target = validTownTarget(playerNum);
    if (!(jailed)) {
        nightAction = ((("You have decided to kill " + (java.lang.String.valueOf(target))) + "(") + (players.get(target).roleName)) + ") tonight.";
        if (!(blocked)) {
            target = checkTargetSwitch(target);
            lethalAttack(target, "Serial Killer");
        }
    }
}