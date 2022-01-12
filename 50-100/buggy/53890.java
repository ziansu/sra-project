@java.lang.Override
public void initAllObjects(java.util.ArrayList<gui.components.Visible> viewObjects) {
    addButtons();
    progress1 = getProgress();
    label1 = new gui.components.TextLabel(130, 230, 300, 40, "Let's play Simon!");
    moveSequence1 = new java.util.ArrayList<gui.simon.MoveInterfaceKristyT>();
    lastSelectedButton = -1;
    moveSequence1.add(randomMove());
    moveSequence1.add(randomMove());
    roundNumber = 0;
    viewObjects.add(progress1);
    viewObjects.add(label1);
}