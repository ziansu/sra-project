private boolean shouldCleanBuildBasedOnState(hudson.model.Result result) {
    if (result == null)
        return true;
    
    if (result.equals(Result.SUCCESS))
        return this.cleanWhenSuccess;
    
    if (result.equals(Result.UNSTABLE))
        return this.cleanWhenUnstable;
    
    if (result.equals(Result.FAILURE))
        return this.cleanWhenFailure;
    
    if (result.equals(Result.NOT_BUILT))
        return this.cleanWhenNotBuilt;
    
    if (result.equals(Result.ABORTED))
        return this.cleanWhenAborted;
    
    return true;
}