public org.jtalks.jcommune.model.entity.Topic get(java.lang.Long id, java.lang.String type) throws org.jtalks.jcommune.plugin.api.exceptions.NotFoundException {
    org.jtalks.jcommune.model.entity.Topic topic = topicFetchService.get(id);
    if (!(topic.getType().equalsIgnoreCase(type))) {
        throw new org.jtalks.jcommune.plugin.api.exceptions.NotFoundException();
    }
    return topic;
}