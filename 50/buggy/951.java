public void listenPort(int portNumber, ar.fiuba.tdd.tp.games.GameBuilder gameBuilder) {
    ar.fiuba.tdd.tp.red.server.ServerPortListenerThread thread = new ar.fiuba.tdd.tp.red.server.ServerPortListenerThread(portNumber, gameBuilder);
    thread.run();
    portThreads.add(thread);
}