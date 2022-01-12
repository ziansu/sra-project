public void endStep() {
    fat -= (com.LuDik.EvoAI.Creature.BASE_FAT_CONSUMPTION) + ((((fatBurned) * (age)) * (age)) / (com.LuDik.EvoAI.Creature.BASE_CREATURE_EFFICIENCY));
    weight = (fat) * (com.LuDik.EvoAI.Creature.WEIGHT_PER_FAT);
    if (((fat) <= 0) || ((water) <= 0)) {
        isDead = true;
    }else {
        age += Configuration.AGE_PER_STEP;
    }
}