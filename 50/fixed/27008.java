public com.hazelcast.config.CacheSimpleConfig setInMemoryFormat(com.hazelcast.config.InMemoryFormat inMemoryFormat) {
    this.inMemoryFormat = com.hazelcast.util.Preconditions.isNotNull(inMemoryFormat, "In-Memory format cannot be null !");
    return this;
}