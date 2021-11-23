@java.lang.Override
public void save() {
    java.util.prefs.Preferences prefs = getMainPrefereces().node(getNodeName());
    java.lang.System.out.println(("Saved Height: " + (this.height)));
    java.lang.System.out.println(("Saved Width: " + (this.width)));
    prefs.putDouble("WindowHeight", this.height);
    prefs.putDouble("WindowWidth", this.width);
    prefs.putDouble("PosX", this.posX);
    prefs.putDouble("PosY", this.posY);
}