private java.lang.String loadBeanUniqCode(java.lang.String beanFilePath) {
    java.lang.String hashCode = java.lang.String.valueOf(handy.tools.helpers.PathHelper.resolveAbsolutePath(beanFilePath).hashCode());
    this.setDefaultUniqueCode(hashCode);
    return hashCode;
}