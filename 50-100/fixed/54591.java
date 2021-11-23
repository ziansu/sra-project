public static void main(java.lang.String[] args) {
    if ((args.length) >= 1)
        TestMutexSingle.tn = java.lang.Long.valueOf(args[0]);
    
    if (TestMutexSingle.isLoaded)
        new TestMutexSingle().countThread();
    else
        java.lang.System.out.println("load lib error!");
    
}