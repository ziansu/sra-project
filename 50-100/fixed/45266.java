private void setDefaultCopyFromVersion() {
    java.util.List<org.zanata.action.VersionHome.VersionItem> otherVersions = getOtherVersions();
    if ((!(otherVersions.isEmpty())) && (org.apache.commons.lang.StringUtils.isEmpty(copyFromVersionSlug))) {
        this.copyFromVersionSlug = otherVersions.get(0).getVersion().getSlug();
        copyFromVersion = true;
    }else {
        copyFromVersion = false;
    }
}