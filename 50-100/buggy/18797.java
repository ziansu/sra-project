public void CrowdStart() {
    if (!(soundEnabled)) {
        return ;
    }
    int index = java.util.concurrent.ThreadLocalRandom.current().nextInt(0, crowdSounds.length);
    currentCrowdSound = crowdSounds[index];
    currentCrowdId = currentCrowdSound.play(0.25F);
    currentCrowdSound.setLooping(currentCrowdId, true);
}