public java.util.Set<java.lang.Class> getAllInterfaces(java.lang.Class targetClass) {
    java.util.Set<java.lang.Class> interfaces = java.util.Arrays.stream(targetClass.getInterfaces()).collect(java.util.stream.Collectors.toSet());
    interfaces.stream().map(this::getAllInterfaces).forEach(interfaces::addAll);
    return interfaces;
}