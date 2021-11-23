@java.lang.Override
public int readMem(int address) {
    if ((keyboard) == null)
        return 0;
    
    if ((readSwitchStatus) == null) {
        keyboard.toggleKeyQueue(true);
        return keyboard.getTypedKeyCode();
    }else
        return readSwitchStatus.getState() ? 128 | (keyboard.getTypedKeyCode()) : 127 & (keyboard.getTypedKeyCode());
    
}