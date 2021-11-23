public void npcLoop(float time) {
    lastThinkUpdateTime += time;
    lastTickUpdateTime += time;
    if ((lastTickUpdateTime) > 50.0F) {
        this.update(lastTickUpdateTime);
        lastTickUpdateTime = 0;
    }
    if ((lastThinkUpdateTime) > 500.0F) {
        chase = false;
        bt.update(lastThinkUpdateTime);
        lastThinkUpdateTime = 0;
    }
}