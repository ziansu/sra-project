@java.lang.Override
public void save() {
    java.util.prefs.Preferences prefs = getMainPrefereces().node(getNodeName());
    prefs.putDouble("WindowHeight", this.height);
    prefs.putDouble("WindowWidth", this.width);
    prefs.putDouble("PosX", this.posX);
    prefs.putDouble("PosY", this.posY);
}