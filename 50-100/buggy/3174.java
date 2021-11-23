@java.lang.Override
public void run() {
    try {
        getMessages();
    } catch (java.io.EOFException eof) {
        chat.log(((eof.getMessage()) + " Disconnected from host."));
    } catch (java.lang.ClassNotFoundException cnf) {
        chat.log("The message recieved from the server could not be understood. Are you using the right version?");
    } catch (java.io.IOException e) {
        chat.log(e.toString());
    }
}