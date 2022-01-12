public void beginTurn() {
    int totalFoodCost = (units.calculateTotalUpkeep()) + (armies.calculateTotalUpkeep());
    int totalWoodCost = structures.calculateTotalUpkeep();
    food -= totalFoodCost;
    wood -= totalWoodCost;
    armies.executeCommands();
    structures.executeCommands();
}