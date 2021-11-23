public void loadObject(java.io.DataInputStream dis) throws java.io.IOException {
    int n = dis.readInt();
    lejos.robotics.navigation.Waypoint wp = new lejos.robotics.navigation.Waypoint(0, 0);
    this.clear();
    for (int i = 0; i < n; i++) {
        wp.loadObject(dis);
        add(wp);
    }
}