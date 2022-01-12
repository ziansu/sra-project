private static void createDifficulties(models.Game game) {
    java.lang.Integer index = 0;
    java.util.Scanner sc = new java.util.Scanner(game.difficulties.get(0).name);
    while (sc.hasNextLine()) {
        controllers.GameController.createDifficulty(game, index, sc.nextLine().trim());
        index++;
    } 
}