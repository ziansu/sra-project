public static kiviuq.entities.LevelTemplate getExampleTemplateLightning() {
    java.lang.System.out.println("getting example Lightning template");
    if ((development.Templates.temp) == null) {
        kiviuq.entities.StarCriteria sc = new kiviuq.entities.StarCriteria(0, 0, 50, 100, 300, 4);
        development.Templates.temp = new kiviuq.entities.LevelTemplate(1, kiviuq.entities.GameMode.Lightning, 60, 30, 50, 60, sc);
    }
    return development.Templates.temp;
}