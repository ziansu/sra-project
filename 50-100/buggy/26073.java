private int calculateFortuneMulti(int level, java.util.Random random) {
    int chanceOfEachBonus = 100 / (level + 2);
    int roll = random.nextInt(100);
    if (roll <= (chanceOfEachBonus * level)) {
        return (roll / chanceOfEachBonus) + 2;
    }else {
        return 1;
    }
}