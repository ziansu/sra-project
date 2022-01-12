public static javax.shell.Shell getInstance() {
    java.lang.String threadName = java.lang.Thread.currentThread().getName();
    javax.shell.Shell sh = javax.shell.Shell.instances.get(threadName);
    if (sh == null) {
        sh = new javax.shell.Shell();
        javax.shell.Shell.instances.put(threadName, sh);
    }
    java.lang.System.out.println(("Returning Shell: " + sh));
    return sh;
}