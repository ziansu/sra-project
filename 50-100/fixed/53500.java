private static void createPlatforms(models.Game game) {
    java.util.Scanner sc = new java.util.Scanner(game.platforms.get(0).name);
    if (sc.hasNextLine()) {
        while (sc.hasNextLine()) {
            controllers.GameController.createPlatform(game, sc.nextLine().trim());
        } 
        game.platforms.remove(0);
    }else {
        controllers.GameController.createPlatform(game, " ");
    }
}