@java.lang.Override
public void initAllObjects(java.util.ArrayList<guiPractice.components.Visible> viewObjects) {
    background = new guiPractice.components.Graphic(0, 0, getWidth(), getHeight(), "img/Grassland.jpg");
    viewObjects.add(background);
    setUpFog();
    game.mainScreenTeam.HomeKat katCode = new game.mainScreenTeam.HomeKat(viewObjects, getWidth(), getHeight());
}