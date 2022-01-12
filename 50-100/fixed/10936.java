@java.lang.Override
public java.lang.String getReply() {
    java.lang.String msg = null;
    try {
        msg = ((java.lang.String) (objectInputStream.readObject()));
    } catch (java.io.IOException | java.lang.ClassNotFoundException e) {
        java.lang.System.err.println(("Error reading stream " + (e.getMessage())));
    }
    return msg;
}