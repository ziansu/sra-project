public void sendMessage(java.lang.String msg) {
    try {
        out.write(msg);
        out.newLine();
        out.flush();
    } catch (java.io.IOException e) {
        client.view.Printer.print("Lost connection. (Maybe you were kicked...?)");
    }
}