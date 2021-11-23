public void roundFinished() {
    (this.specialAbilityDuration)--;
    if ((this.specialAbilityDuration) <= 0) {
        this.specialAbilityDuration = 0;
        if ((this.bonusAtk) < 0) {
            this.bonusAtk = 0;
            java.lang.System.out.println("Die Wirkung der Powerpille laesst nach!");
        }
    }
}