public java.lang.Class<?> getDestHintType(java.lang.Class<?> runtimeSrcClass, org.dozer.util.DozerClassLoader classLoader) {
    if ((getDestHintContainer()) != null) {
        if ((getSrcHintContainer()) != null) {
            return getDestHintContainer().getHint(runtimeSrcClass, getSrcHintContainer().getHints(classLoader));
        }else {
            return getDestHintContainer().getHint(classLoader);
        }
    }else {
        return runtimeSrcClass;
    }
}