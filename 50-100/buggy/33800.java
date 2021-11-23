public void updateElapsedTime(boolean isRemoving) {
    long now = dateUtils.currentTimeMillis();
    if ((fulfilledTime) != 0)
        this.elapsedTime = now - (fulfilledTime);
    
    if (isRemoving)
        fulfilledTime = 0;
    
    this.xOCCIAtt.put(OrderAttribute.ELAPSED_TIME.getValue(), java.lang.String.valueOf(elapsedTime));
}