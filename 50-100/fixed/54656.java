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
                if ((mChannel) != null) {
                    mChannel.close();
                }
            }
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}