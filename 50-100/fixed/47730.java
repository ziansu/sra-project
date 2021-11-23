@java.lang.Override
protected void configure() {
    map().setId(source.getId());
    map().setGridName(source.getGridName());
    map().setName(source.getName());
    map().setExtrauser(source.getExtrauser());
}