public void addEntityNavigationLink(org.apache.olingo.client.api.domain.ClientEntity entity, java.lang.String lookupEntitySet, java.lang.String navigationName, java.lang.String linkedEntityId) {
    if (linkedEntityId != null) {
        try {
            entity.getNavigationLinks().add(odataClient.getObjectFactory().newEntityNavigationLink(navigationName, new java.net.URI((((lookupEntitySet + "(") + linkedEntityId) + ")"))));
        } catch (java.net.URISyntaxException e) {
            throw new org.apache.olingo.client.api.http.HttpClientException(e);
        }
    }
}