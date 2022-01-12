private static <C> void checkAddClass(java.util.Collection<java.lang.Class<? extends C>> found, java.lang.Class<C> type, java.io.File root, java.lang.String packageStart, java.lang.String name) {
    if (name.endsWith(Property.EXTENSION_CLASS)) {
        try {
            final java.lang.Class<? extends C> clazz = com.b3dgs.lionengine.editor.utility.UtilClass.getImplementing(type, root, packageStart, name);
            if (clazz != null) {
                found.add(clazz);
            }
        } catch (final com.b3dgs.lionengine.LionEngineException exception) {
            return ;
        }
    }
}