public static void main(java.lang.String[] args) {
    if ("start".equals(args[0])) {
        main.EarthModellingDaemon.keystorePassword = args[1];
        main.EarthModellingDaemon.arcgisServerUsername = args[2];
        main.EarthModellingDaemon.arcgisServerPassword = args[3];
        main.EarthModellingDaemon.webServerPassword = args[4];
        main.EarthModellingDaemon.webServerUsername = args[5];
    }else
        if ("stop".equals(args[0]))
            main.EarthModellingDaemon.stop();
        
    
}