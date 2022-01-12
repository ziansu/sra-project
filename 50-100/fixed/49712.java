public void saveClassData(java.lang.ClassLoader loader, java.lang.String className, org.fakereplace.data.ClassDataBuilder data) {
    className = className.replace('/', '.');
    java.util.Map<java.lang.String, org.fakereplace.data.ClassData> map = org.fakereplace.data.ClassLoaderData.get(loader).getClassData();
    map.put(className, data.buildClassData());
}