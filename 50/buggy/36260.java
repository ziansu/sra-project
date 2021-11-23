public boolean matchThen(com.alibaba.dubbo.common.URL url, com.alibaba.dubbo.common.URL param) {
    return ((thenCondition) != null) && (matchCondition(thenCondition, url, param));
}