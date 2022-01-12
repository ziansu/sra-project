public static kiviuq.entities.LevelTemplate getExampleTemplatePuzzle() {
    java.lang.System.out.println("getting example Puzzle template");
    if ((development.Templates.temp) == null) {
        kiviuq.entities.StarCriteria sc = new kiviuq.entities.StarCriteria(0, 0, 50, 100, 300, 4);
        development.Templates.temp = new kiviuq.entities.LevelTemplate(2, kiviuq.entities.GameMode.Puzzle, 60, 30, 50, 60, sc);
    }
    return development.Templates.temp;
}