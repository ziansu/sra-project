@java.lang.Override
public int getSize() throws java.io.IOException {
    outToServer.writeBytes(("SIZE" + "\n"));
    java.lang.String response = inFromServer.readLine();
    return java.lang.Integer.parseInt(response);
}