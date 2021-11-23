public java.lang.String getNextSpawnTime() {
    if ((type) == (kr.koinichi.ms2boss.Boss.BossType.UNKNOWN)) {
        return "";
    }
    if ((type) == (kr.koinichi.ms2boss.Boss.BossType.RAID)) {
        return "";
    }
    updateNextSpawnTime();
    java.lang.String next_time = spawn_times.get((((next_spawn_time_idx) + 1) % (spawn_times.size())));
    return next_time;
}