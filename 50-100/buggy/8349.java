@java.lang.Override
public void destroy() {
    try {
        if ((consumer) != null) {
            consumer.close();
        }
        if ((session) != null) {
            session.close();
        }
        if ((connection) != null) {
            connection.close();
        }
    } catch (java.lang.Exception ex) {
        throw new java.lang.RuntimeException(("Exception on closing SQS connection: " + (ex.getMessage())), ex);
    }
}