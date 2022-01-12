public boolean matches(DebugUtils.DebugFlagBase... flags) {
    if ((flags.length) == 0)
        return true;
    
    for (DebugUtils.DebugFlagBase flag : flags) {
        if ((flag == null) || (((value) & (flag.toInt())) != 0))
            return true;
        
    }
    return false;
}