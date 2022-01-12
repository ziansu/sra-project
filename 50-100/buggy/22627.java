@java.lang.Override
public int readMem(int address) {
    if ((readSwitchStatus) == null) {
        keyboard.toggleKeyQueue(true);
        return (keyboard) == null ? 0 : keyboard.getTypedKeyCode();
    }else
        return readSwitchStatus.getState() ? 128 | (keyboard.getTypedKeyCode()) : 127 & (keyboard.getTypedKeyCode());
    
}