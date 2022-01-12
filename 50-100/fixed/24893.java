public void whisper(java.lang.String sender, java.lang.String name, java.lang.String msg) {
    for (main.Server.ClientDto c : clients) {
        if (c.getName().equals(name)) {
            c.send(((("<" + sender) + " whispers:> ") + msg));
        }
    }
    main.Chat.printLn(((("<whispered to:" + name) + "> ") + msg));
}