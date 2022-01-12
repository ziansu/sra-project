public void updateResourceDownloads(java.lang.String resource) {
    lock_.lock();
    java.lang.Integer counter = resourcesInfo_.get(resource);
    if (counter != null) {
        resourcesInfo_.put(resource, new java.lang.Integer((counter + 1)));
    }else {
        resourcesInfo_.put(resource, new java.lang.Integer(0));
    }
    lock_.unlock();
}