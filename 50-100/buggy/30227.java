@java.lang.Override
public boolean shouldExecute() {
    if ((runDelay) > 0) {
        --(runDelay);
        return false;
    }else {
        runDelay = 200 + (theEntity.getRNG().nextInt(200));
        return searchForDestination();
    }
}