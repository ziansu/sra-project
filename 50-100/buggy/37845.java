private boolean onArrowUp(org.luwrain.app.commander.KeyboardEvent event, boolean briefIntroduction) {
    if ((items) == null) {
        org.luwrain.app.commander.Speech.say(stringConstructor.inaccessibleDirectoryContent(), Speech.PITCH_HIGH);
        return true;
    }
    if ((hotPointY) < 1) {
        org.luwrain.app.commander.Speech.say(stringConstructor.noItemsAbove(), Speech.PITCH_HIGH);
        return true;
    }
    hotPointX = org.luwrain.app.commander.PanelArea.INITIAL_HOT_POINT_X;
    (hotPointY)--;
    luwrain.onAreaNewHotPoint(this);
    introduceItem(hotPointY, briefIntroduction);
    return true;
}