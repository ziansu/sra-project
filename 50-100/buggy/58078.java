private io.gravitee.repository.management.model.View convert(final io.gravitee.repository.redis.management.model.RedisView redisView) {
    final io.gravitee.repository.management.model.View view = new io.gravitee.repository.management.model.View();
    view.setId(redisView.getId());
    view.setName(redisView.getName());
    view.setDescription(redisView.getDescription());
    return view;
}