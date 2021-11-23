public boolean isTool(org.bukkit.Material m) {
    for (int i = 0; i < (toolsArray.length); i++)
        if ((toolsArray[i]) == m)
            return true;
        
    
    return false;
}