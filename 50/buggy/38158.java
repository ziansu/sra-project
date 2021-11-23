private void instantTick() {
    advanceTime();
    handleExit();
    updateViews();
    changeSubscriptionFloorPercentage();
    handleEntrance();
}