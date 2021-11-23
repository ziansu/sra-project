@java.lang.Override
protected void tearDown() throws java.lang.Exception {
    super.tearDown();
    connection.close();
    if ((broker) != null) {
        broker.stop();
    }
}