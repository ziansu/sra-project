@java.lang.Override
public boolean isValidMetaValue(int meta) {
    if ((meta < 0) || (meta >= 16))
        return false;
    
    return ((unlocalizedNames) != null) && ((unlocalizedNames[meta]) != null);
}