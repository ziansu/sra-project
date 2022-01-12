public static void debugClass(java.lang.Class<?> _class) {
    java.lang.Class<?> rootClass = Utils.getRootClass(_class);
    DebugUtils.DebugFlags dbgFlags = DebugUtils.dbgClassFlags.get(rootClass);
    DebugUtils.dbgClasses.put(_class, rootClass);
    DebugUtils.dbgClassFlags.put(rootClass, (dbgFlags == null ? new DebugUtils.DebugFlags() : dbgFlags));
}