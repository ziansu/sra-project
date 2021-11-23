public void run() {
    while (true) {
        try {
            EchoPacket fromServer = ((EchoPacket) (myclient.in.readObject()));
            if (fromServer == null) {
                java.lang.System.out.println("killed");
            }
            Mazewar.que.add(fromServer);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    } 
}