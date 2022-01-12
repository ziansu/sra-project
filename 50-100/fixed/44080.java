@java.lang.Override
protected com.sdl.webapp.tridion.PublicationMappingData getPublicationMappingData(java.lang.String url) throws com.sdl.webapp.tridion.PublicationMappingNotFoundException {
    try {
        com.sdl.web.api.dynamic.mapping.PublicationMapping publicationMapping = dynamicMappingsRetriever.getPublicationMapping(url);
        if (publicationMapping == null) {
            throw new com.sdl.webapp.tridion.PublicationMappingNotFoundException((("Publication mapping not found. " + ("Check if your cd_dynamic_conf.xml configuration file contains a publication mapping " + "that matches this URL: ")) + url));
        }
        return new com.sdl.webapp.tridion.PublicationMappingData(java.lang.String.valueOf(publicationMapping.getPublicationId()), getPublicationMappingPath(publicationMapping.getPath()));
    } catch (com.tridion.configuration.ConfigurationException e) {
        return null;
    }
}