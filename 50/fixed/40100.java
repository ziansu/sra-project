public java.lang.String getWebKeyFor(T pojo) {
    com.googlecode.objectify.Key<T> key = this.getKeyFromPojo(pojo);
    return null == key ? org.apache.commons.lang3.StringUtils.EMPTY : key.toWebSafeString();
}