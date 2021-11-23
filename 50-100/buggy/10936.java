@java.lang.Override
public java.lang.String getReply() {
    org.academiadecodigo.bootcamp8.shared.message.Message<java.lang.String> msg = null;
    try {
        msg = ((org.academiadecodigo.bootcamp8.shared.message.Message) (objectInputStream.readObject()));
    } catch (java.io.IOException | java.lang.ClassNotFoundException e) {
        java.lang.System.err.println(("Error reading stream " + (e.getMessage())));
    }
    return msg.getContent();
}