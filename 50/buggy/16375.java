public gregtech.common.GT_Worldgen_GT_Ore_Layer getWorldgen(int randomWeight) {
    for (gregtech.common.GT_Worldgen_GT_Ore_Layer i : list) {
        randomWeight -= i.mWeight;
        if (randomWeight <= 0) {
            return i;
        }
    }
    return null;
}