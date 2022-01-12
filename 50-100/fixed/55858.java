public void run() {
    super.run();
    nachos.userprog.UserProcess process = nachos.userprog.UserProcess.newUserProcess();
    java.lang.String shellProgram = nachos.userprog.Machine.getShellProgramName();
    nachos.userprog.Lib.assertTrue(process.execute(shellProgram, new java.lang.String[]{  }));
    nachos.userprog.KThread.currentThread().finish();
}