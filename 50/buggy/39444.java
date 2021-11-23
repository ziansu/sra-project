@java.lang.Override
public void writeMem(int address, int value) {
    if ((readSwitchStatus) == null)
        keyboard.toggleKeyQueue(false);
    
    keyboard.getHeldKeyCode();
}