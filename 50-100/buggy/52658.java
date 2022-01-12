@java.lang.SuppressWarnings(value = "unchecked")
private void stopGenerator(java.lang.String className) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
    if (this.mActiveGenerators.contains(className)) {
        java.lang.Class<com.audacious_software.passive_data_kit.generators.Generator> probeClass = ((java.lang.Class<com.audacious_software.passive_data_kit.generators.Generator>) (java.lang.Class.forName(className)));
        java.lang.reflect.Method stop = probeClass.getDeclaredMethod("stop", probeClass);
        stop.invoke(null, this.mContext);
        this.mActiveGenerators.remove(className);
    }
}