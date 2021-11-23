private static int getOpenPort() {
    int min = 49512;
    int max = 65535;
    int port = (com.cinchapi.concourse.server.ManagedConcourseServer.RAND.nextInt(min)) + (max - min);
    return com.cinchapi.concourse.server.ManagedConcourseServer.isPortAvailable(port) ? port : com.cinchapi.concourse.server.ManagedConcourseServer.getOpenPort();
}