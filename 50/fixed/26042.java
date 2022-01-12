public int getRandomPresetId() {
    return (minId) + ((int) (((maxId) - (minId)) * (java.lang.Math.random())));
}