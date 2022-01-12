private boolean onEnd(org.luwrain.app.commander.KeyboardEvent event) {
    if ((items) == null) {
        org.luwrain.app.commander.Speech.say(stringConstructor.inaccessibleDirectoryContent(), Speech.PITCH_HIGH);
        return true;
    }
    hotPointY = items.size();
    hotPointX = 0;
    org.luwrain.app.commander.Speech.say(org.luwrain.app.commander.Langs.staticValue(Langs.EMPTY_LINE), Speech.PITCH_HIGH);
    luwrain.onAreaNewHotPoint(this);
    return true;
}