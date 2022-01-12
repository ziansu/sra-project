private org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitterAdapter getAdapterFor(java.lang.Class<?> type) {
    for (java.lang.Class<?> adapteeType : getAdapterMap().keySet()) {
        if (adapteeType.isAssignableFrom(type)) {
            return getAdapterMap().get(adapteeType);
        }
    }
    return null;
}