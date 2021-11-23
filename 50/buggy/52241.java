@java.lang.Override
public void onResponse(java.lang.Object response) {
    latch.countDown();
}