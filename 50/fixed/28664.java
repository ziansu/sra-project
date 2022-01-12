public void robotWaterLevelChange(int severity) {
    int val = waterLvl.get();
    val = val - (severity * 100);
    waterLvl.set(val);
}