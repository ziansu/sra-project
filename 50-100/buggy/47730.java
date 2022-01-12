@java.lang.Override
protected void configure() {
    map().setId(source.getId());
    map().setExpert(source.getExpert());
    map().setMetricators(source.getMetricators());
    map().setGridName(source.getGridName());
    map().setName(source.getName());
    map().setQuestioners(source.getQuestioners());
    map().setExtrauser(source.getExtrauser());
}