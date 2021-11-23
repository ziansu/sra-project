public static void set(com.tiscover.logging.graphite.GraphiteService instance) {
    if ((com.tiscover.logging.graphite.GraphiteService.instance) != instance) {
        com.tiscover.logging.graphite.GraphiteService.instance.stopTimer();
    }
    com.tiscover.logging.graphite.GraphiteService.instance = instance;
}