public static javax.shell.Shell getInstance() {
    javax.shell.Shell sh = javax.shell.Shell.instances.get(java.lang.Thread.currentThread());
    if (sh == null) {
        sh = new javax.shell.Shell();
        javax.shell.Shell.instances.put(java.lang.Thread.currentThread(), sh);
    }
    return null;
}