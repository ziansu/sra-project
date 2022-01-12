private int handleHalt() {
    if ((pid) == (nachos.userprog.UserProcess.ROOT))
        nachos.userprog.Machine.halt();
    
    return 0;
}