public void manualLoop() {
    for (int i = 0; i < (encoderLevels.length); i++) {
        if (((forkliftEncoder.get()) < ((encoderLevels[i]) + 50)) && ((forkliftEncoder.get()) > ((encoderLevels[i]) - 50))) {
            levelIndex = i;
            java.lang.System.out.println(("Forklift moved to level: " + (levelIndex)));
        }
    }
}