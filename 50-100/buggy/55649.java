public static org.springframework.context.ConfigurableApplicationContext start(java.lang.Object... sources) {
    java.lang.Object[] newSources = new java.lang.Object[(sources.length) + 1];
    newSources[0] = org.kurento.room.KurentoRoomServerApp.class;
    for (int i = 0; i < (sources.length); i++)
        newSources[(i + 1)] = sources[i];
    
    org.springframework.boot.SpringApplication application = new org.springframework.boot.SpringApplication(newSources);
    org.kurento.perseus.PerseusApp.context = application.run();
    return org.kurento.perseus.PerseusApp.context;
}