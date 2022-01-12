public java.lang.String getNextSpawnTime() {
    if ((type) == (kr.koinichi.ms2boss.Boss.BossType.UNKNOWN)) {
        return "";
    }
    if ((type) == (kr.koinichi.ms2boss.Boss.BossType.RAID)) {
        return "";
    }
    updateNextSpawnTime();
    java.lang.String next_time = spawn_times[next_spawn_time_idx];
    return next_time;
}