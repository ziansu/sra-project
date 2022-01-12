@java.lang.Override
public int readMem(int address) {
    if ((keyboard) == null)
        return 0;
    
    if ((readSwitchStatus) == null) {
        keyboard.toggleKeyQueue(false);
        int ret = keyboard.getHeldKeyCode();
        return ret;
    }else
        return readSwitchStatus.getState() ? 128 | (keyboard.getHeldKeyCode()) : 127 & (keyboard.getHeldKeyCode());
    
}