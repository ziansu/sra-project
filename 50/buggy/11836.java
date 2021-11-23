public void maybeMakeProgress(java.util.Random random) {
    this.makeProgress();
    if ((random.nextInt(1000000)) < (this.getProgressChance())) {
        this.makeProgress();
    }
}