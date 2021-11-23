@java.lang.Override
public java.lang.String render(com.jivesoftware.os.wiki.miru.deployable.region.MiruHomeRegion.HomeInput input) {
    java.util.Map<java.lang.String, java.lang.Object> data = com.google.common.collect.Maps.newHashMap();
    data.put("intakeURL", input.intakeURL);
    return renderer.render(template, data);
}