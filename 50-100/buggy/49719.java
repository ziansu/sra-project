public void updateResourceDownloads(java.lang.String resource) {
    lock_.lock();
    java.lang.Integer counter = resourcesInfo_.get(resource);
    if (counter != null) {
        ++counter;
    }else {
        counter = new java.lang.Integer(0);
        resourcesInfo_.put(resource, counter);
    }
    lock_.unlock();
}