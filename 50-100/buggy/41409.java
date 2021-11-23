@java.lang.Override
public boolean shouldContinueUponFieldFailure(com.yahoo.elide.security.PermissionManager.CheckMode checkMode, boolean hasDeferredChecks) {
    if (!((checkMode == (PermissionManager.CheckMode.ALL)) || (!hasDeferredChecks))) {
        log.debug("Continuing on field-level check failure: {} {}", checkMode, hasDeferredChecks);
        return true;
    }
    log.debug("Not continuing on field-level check failure: {} {}", checkMode, hasDeferredChecks);
    return false;
}