private byte grant(final byte operation, final java.lang.Byte ac) {
    if (operation == (ORole.PERMISSION_NONE))
        return 0;
    
    byte currentValue = (ac == null) ? ORole.PERMISSION_NONE : ac;
    currentValue |= operation;
    return currentValue;
}