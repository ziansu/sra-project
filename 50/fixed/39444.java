@java.lang.Override
public void writeMem(int address, int value) {
    if ((keyboard) == null)
        return ;
    
    if ((readSwitchStatus) == null)
        keyboard.toggleKeyQueue(false);
    
    keyboard.getHeldKeyCode();
}