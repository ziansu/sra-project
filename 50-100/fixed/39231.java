private java.lang.String getMessage(org.bukkit.Material material, int durability) {
    if (customMessageMap.containsKey(material)) {
        if (customMessageMap.get(material).containsKey(durability)) {
            return format(customMessageMap.get(material).get(durability), material);
        }else {
            return null;
        }
    }else
        if (defaultMessageMap.containsKey(durability)) {
            return format(defaultMessageMap.get(durability), material);
        }else {
            return null;
        }
    
}