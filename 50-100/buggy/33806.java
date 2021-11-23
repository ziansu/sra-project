@java.lang.Override
public int readMem(int address) {
    if ((readSwitchStatus) == null) {
        keyboard.toggleKeyQueue(false);
        int ret = ((keyboard) == null) ? 0 : keyboard.getHeldKeyCode();
        return ret;
    }else
        return readSwitchStatus.getState() ? 128 | (keyboard.getHeldKeyCode()) : 127 & (keyboard.getHeldKeyCode());
    
}