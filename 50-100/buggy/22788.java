private boolean clearAIAndProvideAgain() {
    curAI = null;
    if (curTask.isStillValid(((drone.getInventory().getStackInSlot(0)) != null ? drone.getInventory().getStackInSlot(0) : drone.getTank().getFluid()))) {
        execute(curTask);
        return true;
    }else {
        curTask = null;
        return doLogistics();
    }
}