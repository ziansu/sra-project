public static solution.GameData getInstance(solution.ScotlandYardModel game) {
    if ((solution.GameData.GDInstance) == null) {
        solution.GameData.GDInstance = new solution.GameData(game);
    }
    return solution.GameData.GDInstance;
}