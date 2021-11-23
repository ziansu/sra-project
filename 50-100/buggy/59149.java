public int hashCode() {
    if ((size) == 0)
        return 0;
    
    if ((size) == 1)
        return latmod.lib.LMUtils.hashCodeOf(objects[0]);
    
    int h = 0;
    for (int i = 0; i < (size); i++)
        h = (h * 31) + (latmod.lib.LMUtils.hashCodeOf(objects[i]));
    
    return h;
}