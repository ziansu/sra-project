void resetMonsterHealth() {
    for (int r = 0; r <= (MonsterOrganization.monsterHealth.length); r++) {
        MonsterOrganization.monsterHealth[r] = MonsterOrganization.MONSTER_HEALTH_START[r];
    }
}