public void CrowdStart() {
    if (!(soundEnabled)) {
        return ;
    }
    int index = java.util.concurrent.ThreadLocalRandom.current().nextInt(0, crowdSounds.length);
    currentCrowdSound = crowdSounds[index];
    currentCrowdSound.play();
    currentCrowdSound.setLooping(true);
}