private java.lang.String getIndexName(final org.scenarioo.rest.base.BuildIdentifier buildIdentifier) {
    java.lang.String index = (((getContextPrefix()) + (buildIdentifier.getBranchName())) + "-") + (buildIdentifier.getBuildName());
    return index.toLowerCase();
}