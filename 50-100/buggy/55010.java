@java.lang.Override
protected void postUpdate(models.Project t) {
    super.postUpdate(t);
    cache.removeByPrefix("project:criteria:");
    models.Project existing = cache.get(models.Project.getCacheKey(t.id));
    if (existing != null) {
        cache.removeByPrefix(models.Project.getCacheKey(existing.owner.username, existing.name));
    }
}