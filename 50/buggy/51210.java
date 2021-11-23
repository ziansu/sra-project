public static void init() {
    de.dakror.villagedefense.settings.WaveManager.wave = 0;
    de.dakror.villagedefense.settings.WaveManager.nextWave = de.dakror.villagedefense.settings.WaveManager.waveTimer;
    de.dakror.villagedefense.settings.WaveManager.monsters.clear();
    de.dakror.villagedefense.settings.WaveManager.generateNextWave();
}