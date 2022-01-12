@java.lang.Override
public void destroy() {
    try {
        consumer.close();
        session.close();
        connection.close();
    } catch (java.lang.Exception ex) {
        throw new java.lang.RuntimeException(("Exception on closing SQS connection: " + (ex.getMessage())), ex);
    }
}