@org.jetbrains.annotations.NotNull
protected com.taobao.android.builder.tools.proguard.domain.ClazzInfo getClazzInfo(java.lang.String clazzName) {
    com.taobao.android.builder.tools.proguard.domain.ClazzInfo clazzInfo = clazzInfoMap.get(clazzName);
    if (null == clazzInfo) {
        clazzInfo = new com.taobao.android.builder.tools.proguard.domain.ClazzInfo(clazzName);
        clazzInfoMap.put(clazzName, clazzInfo);
    }
    return clazzInfo;
}