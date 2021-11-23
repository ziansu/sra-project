public static void setup() {
    project.MainHall.MainHall = new project.MainHall();
    project.MainHall.MainHall.items = new project.Item[3];
    project.MainHall.MainHall.characters = new java.lang.Character[3];
    project.MainHall.MainHall.generateItems();
    project.MainHall.MainHall.generateCharacters();
}