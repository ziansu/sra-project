private java.util.List<com.weibo.api.motan.rpc.URL> discoverOneGroup(com.weibo.api.motan.rpc.URL urlCopy) {
    com.weibo.api.motan.util.LoggerUtil.info(("CommandServiceManager discover one group. url:" + (urlCopy.toSimpleString())));
    java.lang.String group = urlCopy.getParameter(URLParamType.group.getName(), URLParamType.group.getValue());
    java.util.List<com.weibo.api.motan.rpc.URL> list = groupServiceCache.get(group);
    if (list == null) {
        list = registry.discoverService(urlCopy);
        groupServiceCache.put(group, list);
    }
    return list;
}