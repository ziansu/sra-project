public boolean isArmor(org.bukkit.Material m) {
    if (isChainmail(m))
        return true;
    
    for (int i = 0; i < (armorArray.length); i++)
        if ((armorArray[i]) == m)
            return true;
        
    
    return false;
}