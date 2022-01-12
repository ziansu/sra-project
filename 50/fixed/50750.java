@java.lang.Override
protected void afterExecute(java.lang.Runnable r, java.lang.Throwable t) {
    java.util.concurrent.FutureTask futureTask = ((java.util.concurrent.FutureTask) (r));
    java.lang.System.out.println(("r.class:" + (r.getClass())));
}