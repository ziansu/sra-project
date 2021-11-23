public void setDependency(redis.clients.jedis.Response<?> dependency) {
    this.dependency = dependency;
    this.requestDependencyBuild = false;
}