public static void main(java.lang.String[] args) {
    LoadSave.LoadData.load("data/factions.xml", new LoadSave.LoadFactionsVisitor());
    LoadSave.LoadData.load("data/faction_relationships.xml", new LoadSave.LoadFactionRelationsVisitor());
    LoadSave.LoadData.load("data/personalities.xml", new LoadSave.LoadPersonalitiesVisitor());
    Model.Model gameLoop = new Model.Model();
    View.View view = new View.View(gameLoop);
    Main.initialize(gameLoop, view);
    view.start();
}