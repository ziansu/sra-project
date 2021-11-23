private void queueUnit(SCBot.UnitType type, int count) {
    for (int i = 0; i < count; i++) {
        unitQueue.add(type);
    }
}