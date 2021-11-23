private io.gravitee.repository.redis.management.model.RedisView convert(final io.gravitee.repository.management.model.View view) {
    final io.gravitee.repository.redis.management.model.RedisView redisView = new io.gravitee.repository.redis.management.model.RedisView();
    redisView.setId(view.getId());
    redisView.setName(view.getName());
    redisView.setDescription(view.getDescription());
    return redisView;
}