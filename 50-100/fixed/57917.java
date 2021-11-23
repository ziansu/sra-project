public void receive() {
    try {
        Message msg = consumer.receive();
        if (msg instanceof TextMessage) {
            java.lang.System.out.println(((((name) + " receive message {") + (((TextMessage) (msg)).getText())) + "}"));
        }else {
            java.lang.System.out.println(("msg: " + msg));
        }
    } catch (JMSException e) {
        e.printStackTrace();
    }
}