public void run() {
    try {
        barrier.await();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    LazyFactoryTest.LazyFactoryTester2.answer.set(finalI, myLazy.get());
    for (int i = 0; i < 100; ++i) {
        assertSame(LazyFactoryTest.LazyFactoryTester2.answer.get(finalI), myLazy.get());
    }
}