public void increaseXP(int xp) {
    this.xp += 1;
    java.lang.System.out.println(((((this.name) + " gained ") + xp) + " xp! "));
    if ((this.xp) >= 10) {
        this.xp -= 10;
        this.level += 1;
        Mechanics.LevelUp.levelUp(this);
    }
}