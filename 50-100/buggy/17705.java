private void addFieldsAndTagsToEvent(com.netflix.simianarmy.Resource resource, com.netflix.simianarmy.MonkeyRecorder.Event event) {
    for (java.lang.String key : resource.getAllTagKeys()) {
        event.addField(key, resource.getTag(key));
    }
    event.addField("ResourceDescription", resource.getDescription());
    event.addField("ResourceType", resource.getResourceType().toString());
}