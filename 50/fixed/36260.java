private boolean matchThen(com.alibaba.dubbo.common.URL url, com.alibaba.dubbo.common.URL param) {
    return (!(((thenCondition) == null) || (thenCondition.isEmpty()))) && (matchCondition(thenCondition, url, param, null));
}