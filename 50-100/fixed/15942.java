public boolean itemDrop(java.lang.Character deadChar) {
    int chance = rnd.nextInt(100);
    if (chance < 20) {
        if (chance < 10) {
            int[] loc = deadChar.getLocation();
            CurvedTestGrade ctg = new CurvedTestGrade(loc[0], loc[1], loc[2], loc[3], loc[4]);
            addThing(ctg, loc[3], loc[4]);
        }
    }
}