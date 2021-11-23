public int howManyPlantsNeedWater() {
    for (TheGardenApplication.Plant plant : plants) {
        if ((plant.needsWater) > (plant.waterLevel)) {
            (howManyPlantsNeedW)++;
        }
    }
    return howManyPlantsNeedW;
}