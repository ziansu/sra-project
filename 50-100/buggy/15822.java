public void levelUp(int level) {
    int lvl = 2;
    if (level > 1) {
        for (int i = 2; i <= level; ++i) {
            life += lvl * 3;
            damage += lvl * 2;
            lvl += 1;
        }
    }
}