public static org.vincent.sendmail.senders.Send getSender(java.lang.String senderClassName) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
    if ((senderClassName == null) || (senderClassName.isEmpty())) {
        throw new java.lang.ClassNotFoundException("The senderClassName cannot be empty");
    }
    java.lang.Class<?> sendClass = java.lang.Class.forName(senderClassName);
    org.vincent.sendmail.senders.Send send = ((org.vincent.sendmail.senders.Send) (sendClass.newInstance()));
    return send;
}