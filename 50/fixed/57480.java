private void copy(org.apache.activemq.command.ActiveMQTextMessage copy) {
    java.lang.String text = this.text;
    super.copy(copy);
    copy.text = text;
}