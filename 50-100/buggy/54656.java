@java.lang.Override
public void run() {
    try {
        final com.rabbitmq.client.ConnectionFactory factory = de.htwk_leipzig.bis.util.ToolBox.createConnectionFactory(mUri);
        final com.rabbitmq.client.Connection connection = factory.newConnection();
        try {
            mChannel = connection.createChannel();
            try {
                doSubscriberActions();
            } finally {
                mChannel.close();
            }
        } finally {
            connection.close();
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}