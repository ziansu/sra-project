public message.MessageUpdate withStatGains(int[] gains, int[] stats) {
    maxHP = stats[Stat.HP.index()];
    statGains = gains;
    newStats = stats;
    updateType = message.MessageUpdate.Update.STAT_GAIN;
    isPlayer = true;
    return this;
}