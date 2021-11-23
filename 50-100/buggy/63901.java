protected void handleSpecialKey(long time, boolean pressed, byte shiftMask, int ikey, boolean keyPad) {
    if (handleActionKey(time, pressed, ikey)) {
        return ;
    }
    if (keyPad) {
        int prev = ikey;
        ikey = convertKeypadToKey(ikey, shiftMask);
        if (ikey != prev)
            shiftMask &= ~(MASK_SHIFT);
        
    }
    if (shiftMask != 0)
        pushShifts(time, pressed, shiftMask);
    
    pushKey(time, pressed, ikey);
}