public synchronized void addSound(java.lang.String sound, java.lang.Integer delay) {
    purgeExpiredSounds(net.hurstfrost.hudson.sounds.SoundsAgentAction.EXPIRY_EXTENSION);
    wavsToPlay.add(new net.hurstfrost.hudson.sounds.ImmediateDataTimestampedSound(sound, ((java.lang.System.currentTimeMillis()) + (delay == null ? (net.hurstfrost.hudson.sounds.SoundsAgentAction.DEFAULT_POLL_INTERVAL) + (net.hurstfrost.hudson.sounds.SoundsAgentAction.LATENCY_COMPENSATION) : delay))));
}