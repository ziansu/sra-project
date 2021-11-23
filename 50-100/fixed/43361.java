public void addMonsterSpawn(server.life.MapleMonster monster, int mobTime, int team) {
    java.awt.Point newpos = calcPointBelow(monster.getPosition());
    newpos.y -= 1;
    server.life.SpawnPoint sp = new server.life.SpawnPoint(monster, newpos, mobTime);
    monsterSpawn.add(sp);
    if ((sp.shouldSpawn()) || (mobTime == (-1))) {
        sp.spawnMonster(this);
    }
}