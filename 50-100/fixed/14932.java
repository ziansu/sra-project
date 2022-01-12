private void sortByBoss() {
    int size = kr.koinichi.ms2boss.BossTimer.bosses.size();
    for (int i = 0; i < size; i++) {
        kr.koinichi.ms2boss.Boss boss = kr.koinichi.ms2boss.BossTimer.bosses.get(i);
        if (boss.show_flag) {
            boss_list.add(new kr.koinichi.ms2boss.SimpleBoss(boss.name, boss.location, boss.getNextSpawnTime(), boss.getNextSpawnIn(1), boss.icon));
        }
    }
}