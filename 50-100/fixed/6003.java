@java.lang.Override
public void initObjects(java.util.List<gui.components.Visible> viewObjects) {
    initAllObjects(viewObjects);
    clickables = new java.util.ArrayList<gui.components.Clickable>();
    for (gui.components.Visible v : viewObjects) {
        if (v instanceof gui.components.Clickable) {
            clickables.add(((gui.components.Clickable) (v)));
        }
    }
}