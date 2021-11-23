public static java.lang.String getPropertyNameForBranch(gobblin.configuration.WorkUnitState workUnitState, java.lang.String key) {
    com.google.common.base.Preconditions.checkNotNull(workUnitState, "Cannot get a property from a null WorkUnit");
    com.google.common.base.Preconditions.checkArgument((!(com.google.common.base.Strings.isNullOrEmpty(key))), "Cannot get a the value for a null or empty key");
    if (!(workUnitState.contains(ConfigurationKeys.FORK_BRANCH_ID_KEY))) {
        return key;
    }else {
        return (workUnitState.getPropAsInt(ConfigurationKeys.FORK_BRANCH_ID_KEY)) == (-1) ? key : (key + ".") + (workUnitState.getPropAsInt(ConfigurationKeys.FORK_BRANCH_ID_KEY));
    }
}