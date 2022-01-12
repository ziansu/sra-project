public void levelUp(int level) {
    this.level = 2;
    if (level > 1) {
        for (int i = 2; i <= level; ++i) {
            life += (this.level) * 3;
            damage += (this.level) * 2;
            this.level += 1;
        }
    }
}