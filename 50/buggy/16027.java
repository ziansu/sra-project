public java.lang.String render(java.lang.String intakeURL) {
    return chrome(homeRegion).render(new com.jivesoftware.os.wiki.miru.deployable.region.MiruHomeRegion.HomeInput(intakeURL));
}