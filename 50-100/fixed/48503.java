public void npcLoop() {
    while (true) {
        currentTime = java.lang.System.nanoTime();
        float elapsedThinkMilliSecs = ((currentTime) - (lastThinkUpdateTime)) / 1000000.0F;
        float elapsedTickMilliSecs = ((currentTime) - (lastTickUpdateTime)) / 1000000.0F;
        if (elapsedTickMilliSecs >= 500.0F) {
            lastTickUpdateTime = currentTime;
        }
        if (elapsedThinkMilliSecs >= 500.0F) {
            java.lang.System.out.print("Think");
            lastThinkUpdateTime = currentTime;
            bt.update(elapsedThinkMilliSecs);
        }
        java.lang.Thread.yield();
    } 
}