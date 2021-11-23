@java.lang.Override
public boolean continueExecuting() {
    boolean continueExecuting = ((!(petPathfinder.noPath())) && ((thePet.getDistanceSqToEntity(theOwner)) > ((maxDist) * (maxDist)))) && (!(thePet.isSitting()));
    java.lang.System.out.println(("Continue executing = " + continueExecuting));
    return continueExecuting;
}