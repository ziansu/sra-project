public void startCooldown(cooldown.WavesCooldown cooldown, int rounds) {
    if (!(resetCooldown(cooldown)))
        THs.add(new cooldown.WavesCDHandler.TimeHelper(cooldown, rounds));
    
}