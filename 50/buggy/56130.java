public static nachos.userprog.UserProcess getRootProcess() {
    nachos.userprog.Lib.assertTrue(((nachos.userprog.UserKernel.rootProcess) == null));
    return nachos.userprog.UserKernel.rootProcess;
}