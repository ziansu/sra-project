private int handleHalt() {
    if ((pid) == (nachos.userprog.UserProcess.ROOT))
        nachos.userprog.Machine.halt();
    else
        nachos.userprog.Lib.assertNotReached("Machine.halt() did not halt machine!");
    
    return 0;
}