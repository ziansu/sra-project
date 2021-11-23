public boolean contains(java.lang.String name) {
    return (!(pw.phylame.commons.util.StringUtils.isEmpty(name))) && (map.containsKey(name));
}