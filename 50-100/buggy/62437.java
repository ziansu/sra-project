private void addRestResourceClasses(java.util.Set<java.lang.Class<?>> resources) {
    resources.add(ch.heigvd.amt.amtproject.rest.config.JacksonConfigurationProvider.class);
    resources.add(ch.heigvd.amt.amtproject.rest.config.JsonExceptionMapper.class);
    resources.add(ch.heigvd.amt.amtproject.rest.resources.BadgesResource.class);
    resources.add(ch.heigvd.amt.amtproject.rest.resources.EventsResource.class);
    resources.add(ch.heigvd.amt.amtproject.rest.resources.LevelRessource.class);
    resources.add(ch.heigvd.amt.amtproject.rest.resources.RulesResource.class);
}