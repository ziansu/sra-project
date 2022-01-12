@java.lang.SuppressWarnings(value = "rawtypes")
public boolean isStarred(java.lang.Object target) {
    if (target == null) {
        return false;
    }
    org.wilson.world.star.StarProvider provider = this.getStarProvider(target);
    java.util.List list = this.stars.get(provider);
    for (java.lang.Object item : list) {
        if (provider.equals(item, target)) {
            return true;
        }
    }
    return false;
}