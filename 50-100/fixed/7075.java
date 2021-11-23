protected boolean checkBabySteps() {
    if (((this.moveCounter) >= 10) && (this.notEarnBabyStep())) {
        achievements.get("BabySteps").setIsEarned(true);
        popingUp.push("BabySteps");
        return true;
    }
    return false;
}