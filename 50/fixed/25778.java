public message.MessageUpdate withStatGains(int[] gains, int[] stats) {
    statGains = gains;
    newStats = stats;
    updateType = message.MessageUpdate.Update.STAT_GAIN;
    isPlayer = true;
    return this;
}