@java.lang.Override
public void initAllObjects(java.util.List<gui.components.Visible> viewObjects) {
    moles = new java.util.ArrayList<whackAMole.MoleInterface>();
    player = getAPlayer();
    label = new gui.components.TextLabel(350, 220, 100, 40, "sample Text");
    timeLabel = new gui.components.TextLabel(360, 40, 80, 40, "30.0");
    viewObjects.add(player);
    viewObjects.add(timeLabel);
    viewObjects.add(label);
}