public static java.util.Set<java.lang.Long> get_user_articles_by_page(long UID, int page, int offset) {
    if (((page * (zxl.redis.Cluster.ARTICLES_PER_PAGE)) + offset) > (zxl.redis.Cluster.jc.zcard(("all_articles:" + UID))))
        return null;
    
    return zxl.redis.Cluster.change_set_type(zxl.redis.Cluster.jc.zrevrange(("all_articles:" + UID), ((page * (zxl.redis.Cluster.ARTICLES_PER_PAGE)) + offset), ((((page + 1) * (zxl.redis.Cluster.ARTICLES_PER_PAGE)) - 1) + offset)));
}