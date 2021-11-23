@java.lang.Override
public void onError(java.lang.Throwable throwable) {
    java.lang.System.out.println(throwable);
    latch.countDown();
    isComplete[0] = false;
}