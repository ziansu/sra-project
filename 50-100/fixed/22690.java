public boolean checkRelation(blackboard.platform.context.Context ctx) {
    if ((ctx.getUser().getSystemRole().compareTo(impersonatedUser.getSystemRole())) >= 0) {
        edu.sdsu.its.impersonate.Impersonate.LOGGER.debug("Impersonate User Level Check Passed");
        return true;
    }
    edu.sdsu.its.impersonate.Impersonate.LOGGER.info("Impersonate User Level Check FAILED");
    return false;
}