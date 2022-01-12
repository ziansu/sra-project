@java.lang.Override
public void run() {
    while (true) {
        try {
            java.lang.System.out.println("Enter new configuration (Places,Philosophs): ");
            java.lang.String startConfig = reader.readLine();
            java.lang.String[] startConfigParts = startConfig.split(",");
            int placeCount = java.lang.Integer.parseInt(startConfigParts[0]);
            int philliCount = java.lang.Integer.parseInt(startConfigParts[1]);
            server.initServer(placeCount, philliCount, firstInit);
            firstInit = false;
        } catch (java.lang.Exception e) {
            vss.a4.server.DistributionServer.logging("IOException in UserInterface", e);
        }
    } 
}