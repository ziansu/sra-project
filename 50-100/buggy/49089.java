public void addSpawn(me.dirkjan.goldiriath.mobspawn.MobSpawn spawn) {
    if (!(spawn.isValid())) {
        plugin.logger.warning((("Could not add mobspawn: " + (spawn.getName())) + ". Mobspawn not valid"));
        return ;
    }
    spawns.add(spawn);
    saveConfig();
}