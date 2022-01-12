public boolean matches(DebugUtils.DebugFlagBase... flags) {
    for (DebugUtils.DebugFlagBase flag : flags) {
        if ((flag == null) || (((value) & (flag.toInt())) != 0))
            return true;
        
    }
    return false;
}