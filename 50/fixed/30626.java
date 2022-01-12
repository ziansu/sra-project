public static void loadImages() {
    java.lang.String path = path(Nation.NEUTRAL, new java.lang.Object() {    });
    entity.neutral.Rock.standImg = game.ImageHandler.load(path, "Rock");
    java.lang.System.out.println(entity.neutral.Rock.standImg);
}