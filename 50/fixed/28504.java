public boolean apply(lycanite.lycanitesmobs.api.entity.Entity entity) {
    return targetClass.isAssignableFrom(entity.getClass());
}