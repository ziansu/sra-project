@java.lang.Override
public void FinishChat() throws java.io.IOException {
    _serverSocket.close();
    super.FinishChat();
}