public void scaleRadius(float s) {
    this.sun.setOrbitRadius(((sun.getOrbitRadius()) * s));
    for (Planet p : planets) {
        p.setOrbitRadius(((p.getOrbitRadius()) * s));
        for (Moon m : p.getMoons()) {
            m.setOrbitRadius(((m.setOrbitRadius()) * s));
        }
    }
}