private GameObjects.Subsystem getSubsystemByIndex(int index) {
    int count = 0;
    for (java.util.Map.Entry<java.lang.String, GameObjects.Subsystem> entry : subsystems.entrySet()) {
        java.lang.String key = entry.getKey();
        GameObjects.Subsystem value = entry.getValue();
        if (count == index) {
            return value;
        }
    }
    return null;
}