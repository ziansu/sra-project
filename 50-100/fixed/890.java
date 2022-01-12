public void run() {
    try {
        barrier.await();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    answer.set(finalI, myLazy.get());
    for (int i = 0; i < 100; ++i) {
        assertSame(answer.get(finalI), myLazy.get());
    }
}