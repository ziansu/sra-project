public boolean apply(lycanite.lycanitesmobs.api.entity.Entity entity) {
    return entity.getClass().isAssignableFrom(targetClass);
}