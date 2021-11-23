@java.lang.Override
public void run() {
    final com.yahoo.squidb.test.TestModel model = new com.yahoo.squidb.test.TestModel();
    testThrowsException(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            model.getSomeMap();
        }
    }, java.lang.UnsupportedOperationException.class);
    assertEquals(java.util.Collections.emptyList(), model.getSomeList());
}