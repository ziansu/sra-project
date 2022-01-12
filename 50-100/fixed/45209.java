public static int open(int port, java.lang.String htmlPath, boolean force) throws java.io.IOException {
    int ap = 0;
    while (true) {
        try {
            net.yacy.grid.http.APIServer.open((port + ap), htmlPath);
            return port + ap;
        } catch (java.io.IOException e) {
            if (force || (ap >= 16)) {
                e.printStackTrace();
                throw e;
            }
            ap++;
            continue;
        }
    } 
}