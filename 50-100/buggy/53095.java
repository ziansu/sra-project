@java.lang.Override
public org.simplity.kernel.value.Value execute(org.simplity.service.ServiceContext ctx) {
    java.lang.System.out.println("Hello");
    java.util.List<org.simplity.kernel.FormattedMessage> msgs = ctx.getMessages();
    for (org.simplity.kernel.FormattedMessage msg : msgs) {
        java.lang.System.out.println(msg.text);
        java.lang.System.out.println(msg.data[0]);
        java.lang.System.out.println(msg.fieldName);
    }
    return null;
}