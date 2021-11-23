public static x10.xrx.FinishState activityCreationBookkeeping() {
    x10.xrx.Activity activity = x10.xrx.Runtime.activity();
    x10.xrx.FinishState fs = activity.finishState();
    fs.notifySubActivitySpawn(x10.xrx.Runtime.home());
    fs.notifyActivityCreation$O(x10.xrx.Runtime.home(), null);
    fs.notifyRemoteContinuationCreated();
    return fs;
}