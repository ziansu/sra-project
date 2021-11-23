private boolean onHome(org.luwrain.app.commander.KeyboardEvent event) {
    if ((items) == null) {
        luwrain.say(stringConstructor.inaccessibleDirectoryContent());
        return true;
    }
    hotPointY = 0;
    hotPointX = ((hotPointY) < (items.size())) ? org.luwrain.app.commander.PanelArea.INITIAL_HOT_POINT_X : 0;
    introduceItem(hotPointY, false);
    luwrain.onAreaNewHotPoint(this);
    return true;
}