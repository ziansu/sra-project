@org.jetbrains.annotations.Nullable
public static java.lang.Class<?> getOBCClass(@org.jetbrains.annotations.NotNull
java.lang.String className) {
    try {
        return java.lang.Class.forName(((at.pcgamingfreaks.Bukkit.NMSReflection.OBC_CLASS_PATH) + className));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}