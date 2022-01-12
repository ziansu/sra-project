private boolean onArrowUp(org.luwrain.app.commander.KeyboardEvent event, boolean briefIntroduction) {
    if ((items) == null) {
        luwrain.say(stringConstructor.inaccessibleDirectoryContent());
        return true;
    }
    if ((hotPointY) < 1) {
        luwrain.say(stringConstructor.noItemsAbove());
        return true;
    }
    hotPointX = org.luwrain.app.commander.PanelArea.INITIAL_HOT_POINT_X;
    (hotPointY)--;
    luwrain.onAreaNewHotPoint(this);
    introduceItem(hotPointY, briefIntroduction);
    return true;
}