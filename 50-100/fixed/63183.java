@java.lang.Override
public java.lang.String serialize() {
    java.lang.String result = ",";
    for (org.bukkit.potion.PotionEffect e : effects)
        result += ((((((e.getType().getName()) + "/") + (e.getDuration())) + "/") + (e.getAmplifier())) + "/") + (e.isAmbient());
    
    return result.substring(1);
}