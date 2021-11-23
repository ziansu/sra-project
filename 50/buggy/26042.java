public int getRandomPresetId() {
    return (minId) + (org.jwildfire.base.Tools.randomInt(((maxId) - (minId))));
}