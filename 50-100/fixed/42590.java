public void run() {
    while (true) {
        try {
            EchoPacket fromServer;
            while ((fromServer = ((EchoPacket) (myclient.in.readObject()))) == null);
            Mazewar.que.add(fromServer);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            java.lang.System.exit(1);
        }
    } 
}