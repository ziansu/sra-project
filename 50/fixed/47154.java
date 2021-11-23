@org.jetbrains.annotations.Contract(value = "null -> false")
public static boolean PlayerClassExists(@org.jetbrains.annotations.Nullable
java.lang.String className) {
    return (className != null) && (tk.martijn_heil.kingdomkits.model.PlayerClass.config.getConfigurationSection("classes.classes").getKeys(false).contains(className));
}