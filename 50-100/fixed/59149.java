public int hashCode() {
    if (((size) == 0) || ((objects[0]) == null))
        return 0;
    
    if ((size) == 1)
        return objects[0].hashCode();
    
    int h = 0;
    for (int i = 0; i < (size); i++)
        h = (h * 31) + (latmod.lib.LMUtils.hashCodeOf(objects[i]));
    
    return h;
}