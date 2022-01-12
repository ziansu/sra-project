private boolean onEnd(org.luwrain.app.commander.KeyboardEvent event) {
    if ((items) == null) {
        luwrain.say(stringConstructor.inaccessibleDirectoryContent());
        return true;
    }
    hotPointY = items.size();
    hotPointX = 0;
    luwrain.say(org.luwrain.app.commander.Langs.staticValue(Langs.EMPTY_LINE));
    luwrain.onAreaNewHotPoint(this);
    return true;
}