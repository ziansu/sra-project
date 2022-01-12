private void deactivate(boolean manual) {
    active = false;
    halted = false;
    if ((task) != null)
        task.cancel();
    
    if ((!manual) && (playerLockEnabled)) {
        lockEnd = (java.lang.System.currentTimeMillis()) + ((playerLockTime) * 1000);
    }else {
        lockEnd = 0;
        userName = null;
    }
}