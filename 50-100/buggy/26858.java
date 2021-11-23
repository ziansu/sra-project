protected void levelUp() {
    if ((level) < 3) {
        (level)++;
        this.attack += this.getAttackGrowth();
        this.max_hp += this.getHpGrowth();
        this.changeCurrentHp(getHpGrowth());
        this.current_hp += this.getHpGrowth();
        this.movement_point += this.getMovementGrowth();
        this.physical_defence += this.getPhysicalDefenceGrowth();
        this.magical_defence += this.getMagicalDefenceGrowth();
    }
}