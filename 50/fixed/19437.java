public int howManyPlantsNeedWater() {
    howManyPlantsNeedW = 0;
    for (TheGardenApplication.Plant plant : plants) {
        if ((plant.needsWater) > (plant.waterLevel)) {
            (howManyPlantsNeedW)++;
        }
    }
    return howManyPlantsNeedW;
}