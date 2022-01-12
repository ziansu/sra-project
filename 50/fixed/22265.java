public void run(java.lang.String text, java.net.ServerSocket serverSocket) {
    net.e6tech.elements.common.util.Terminal terminal = new net.e6tech.elements.common.util.Terminal();
    while (!(_user1(terminal, text, serverSocket)));
    while (!(_user2(terminal, serverSocket)));
}