public void saveClassData(java.lang.ClassLoader loader, java.lang.String className, org.fakereplace.data.BaseClassData data) {
    className = className.replace('/', '.');
    java.util.Map<java.lang.String, org.fakereplace.data.BaseClassData> map = org.fakereplace.data.ClassLoaderData.get(loader).getBaseClassData();
    map.put(className, data);
}